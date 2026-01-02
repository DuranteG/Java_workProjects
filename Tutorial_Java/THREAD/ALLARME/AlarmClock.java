package AlarmClock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class AlarmClock implements Runnable{

    private final LocalTime alarmClock; //tempo per impostare la sveglia
    private final String fileAllarmPath; //suono della sveglia

    AlarmClock(LocalTime alarmClock,String fileAllarmPath){
        this.alarmClock = alarmClock;
        this.fileAllarmPath = fileAllarmPath;
    }

    @Override
    public void run() {
        LocalTime now = LocalTime.now();

        while(now.isBefore(alarmClock)){
            try {
                Thread.sleep(1000);

                now = LocalTime.now();

                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();

                System.out.printf("\r%02d:%02d:%02d", hours,minutes,seconds);
            }catch (IllegalArgumentException e){
                System.out.println("Invalid value of millis");
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        System.out.println("\nALLARME SUONA");
        playSound(fileAllarmPath);
    }

    private void playSound(String fileAllarmPath){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        File audio = new File(fileAllarmPath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audio)){
            Clip clip = AudioSystem.getClip();
            //apre il file e avvia il suono
            clip.open(audioStream);
            clip.start();
            //interrompe da tastiera il suono
            System.out.print("Premi *Enter* per interrompere il suono ");
            in.readLine();
            clip.stop();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("File audio is not supported");
        } catch(LineUnavailableException e){
            System.out.println("Audio is unavailable");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
