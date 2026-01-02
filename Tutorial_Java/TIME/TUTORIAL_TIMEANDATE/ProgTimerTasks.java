package TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class ProgTimerTasks {
    public static void main(String[] args) {
        //

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = 3;
            @Override
            public void run() {
                System.out.println("Hello!!!");
                count--;
                if(count <= 0){
                    System.out.println("Task complete!!!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 0,1000);
    }
}
