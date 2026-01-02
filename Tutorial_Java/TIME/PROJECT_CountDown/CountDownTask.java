package TimerTasks;

import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTask {
    public static void main(String[] args) {
        //countdown timer

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        String s;
        int opt = 0;

        try{
            System.out.print("Inserisci secondo per il countdown: ");
            s = in.readLine();
            opt = Integer.parseInt(s);
        }catch(IOException e){
            System.out.println("Invalid type");
        }


        Timer timer = new Timer();
        int finalOpt = opt;
        TimerTask task = new TimerTask() {
            int count = finalOpt;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("BUON ANNO!!!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0,1000);
    }
}
