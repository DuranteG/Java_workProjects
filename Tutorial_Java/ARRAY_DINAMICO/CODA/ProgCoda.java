package Coda;

import java.io.*;
@SuppressWarnings("ALL")
public class ProgCoda {
    public static void main(String[] args) {
        //programma che simmula il funzionamento di un bar
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        Coda c = new Coda();
        Ordine ordine;
        String tavolo,o,s;

        //int num;
        //Integer numobj;

        int n_ordini = 0;

        try{
            //aggiungiamo elementi alla coda
            /*for(int i = 0;i < 10;i++){
                num = (int) (Math.random() * 100);
                //noinspection removal
                numobj = new Integer(num);
                System.out.println(numobj+" ");
                c.aggiungi(numobj);
            }
            System.out.println("Elementi della pila: "+c.size());
            //togli elementi dalla posizione zero cosi da avere la lista non invertita
            while(!c.vuota()){
                numobj = (Integer) c.togli();
                System.out.println(numobj+" ");
            }
            System.out.println();*/

            System.out.print("Inserisci ordini da registrare: ");
            s = in.readLine();
            n_ordini = Integer.parseInt(s);
            Ordine[] ord = new Ordine[n_ordini];

            for(int i = 0;i<ord.length;i++){
                ordine = new Ordine();
                System.out.print("Inserisci tavolo: ");
                tavolo = in.readLine();
                ordine.setTavolo(tavolo);

                System.out.print("Inserisci ordine: ");
                o = in.readLine();
                ordine.setOrdine(o);

                ordine = new Ordine(tavolo,o);
                ord[i] = ordine;
                c.aggiungi(ordine);
                System.out.println("ORDINE AGGIUNTO");
            }

            while(!c.vuota()){
                ordine = (Ordine) c.togli();
                System.out.println("ORDINE SODDISFATTO");
                ordine.stampa();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
