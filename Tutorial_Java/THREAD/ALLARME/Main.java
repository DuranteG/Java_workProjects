package AlarmClock;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String inputTime = "";
        String fileAllarmPath = "/Users/giovannidurante/Desktop/Desktop/CODING/JAVA/MainTutorial/src/AlarmClock/alarm-clock-short-6402.wav";

        while(alarmTime == null){
            try{
                System.out.print("Inserisci allarme (HH:mm:ss): ");
                inputTime = in.readLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("l'allarme è impostata alle: "+alarmTime);
            } catch (DateTimeException e){
                System.out.println("Invalid format. Please use HH:mm:ss");
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, fileAllarmPath);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
