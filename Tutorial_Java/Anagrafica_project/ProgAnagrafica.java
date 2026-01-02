import java.io.*;
import java.util.Arrays;
public class ProgAnagrafica {
    public static void main(String[] args) {
        //Rappresentare le informazioni di una persona e per registrare il suo contatto email.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        String s;
        int n = 0;


        try{
            System.out.print("Inserisci contatti da registrare: ");
            s = in.readLine();
            n = Integer.parseInt(s);
            Anagrafica[] a = new Anagrafica[n];

            for(int i = 0;i < a.length;i++){
                Anagrafica contatto = new Anagrafica();
                System.out.print("Inserisci nome: ");
                s = in.readLine();
                contatto.setName(s);

                System.out.print("Inserisci cognome: ");
                s = in.readLine();
                contatto.setCognome(s);

                System.out.print("Inserisci email: ");
                s= in.readLine();
                contatto.setEmail(s);

                a[i] = contatto;
                contatto.stampaDati();
            }
        } catch (IOException e) {
            System.out.println("\nRIEPILOGO CONTATTO");
        }

    }
}
