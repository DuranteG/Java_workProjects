package Thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); //quando inserisco da tastiera, il thread è ancora in esecuzione, perciò si richiama il setDeamon(true)
        thread.start();

        String name = "";

        try{
            System.out.println("HAI 10 SECONDI PER INSERIRE IL TUO NOME");
            System.out.print("Inserisci il tuo nome: ");
            name = in.readLine();

            System.out.println("Ciao "+name);
        }catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
