package MusicPlayer;

import javax.sound.sampled.*;
import java.io.*;

public class ProgMusic {
    public static void main(String[] args) {
        //Music player Audio in java (.wav)

        String path = "/Users/giovannidurante/Desktop/Desktop/CODING/JAVA/MainTutorial/src/MusicPlayer/Geolier - 081 (Official Video).wav";
        File file = new File(path);
        String opt = "";

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(input);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            while(!opt.equals("Q") && !opt.equals("q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Choice: ");
                opt = in.readLine();

                switch(opt){
                    case "P", "p" -> clip.start();
                    case "S", "s" -> clip.stop();
                    case "R", "r" -> clip.setMicrosecondPosition(0);
                    case "Q", "q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        }
        catch (IOException e){
            System.out.println("Qualcosa è andato storto");
        }
        finally {
            System.out.println("Bye!!!");
        }
    }
}
