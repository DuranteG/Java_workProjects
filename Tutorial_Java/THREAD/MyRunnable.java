package Thread;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i = 1;i <= 5;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            if(i == 5){
                System.out.println("TEMPO FINITO!!!");
                System.exit(0); //quando supero i secondi prestabiliti il programma continua con exit NO
            }
        }
    }
}
