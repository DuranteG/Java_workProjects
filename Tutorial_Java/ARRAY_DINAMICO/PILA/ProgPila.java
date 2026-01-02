package Pila;

import java.io.*;
@SuppressWarnings("ALL")
public class ProgPila {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        Pila p = new Pila();

        int num;
        Integer numobj;
        //i numeri interi non possono essere inseriti direttamente nella pila perchè accetta solo oggetti.
        // Per superare questo problema si crea un'istanza della classe Integer che incorpora il valore di un
        // numero intero all'interno di un oggetto.

        try{
            //aggiungiamo elementi alla pila
            for(int i = 0;i < 10;i++){
                num = (int) (Math.random() * 100);
                //noinspection removal
                numobj = new Integer(num);
                System.out.println(numobj+" ");
                p.push(numobj);
            }
            System.out.println("Elementi della pila: "+p.size());
            //togli gli elementi dalla pila così da avere la lista invertita
            while(!p.vuota()){
                numobj = (Integer) p.pop();
                System.out.println(numobj+" ");
            }
            System.out.println();
        } catch (Exception e) {

        }
    }
}
