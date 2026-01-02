package Frasi;
/*
Autore: Durante Giovanni
data: 04/12/2020
Oggetto: Programma che realizza un menù per scrivere una frase famosa e leggerla
*/
import java.io.*;
public class frasi{
    String nomeFile;

    frasi(String nomeFile){
        this.nomeFile = nomeFile;
    }

    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(input);

    public void input(boolean modS){
        String f;
        try{
            FileWriter fW = new FileWriter(nomeFile,modS);
            PrintWriter fOUT = new PrintWriter(fW);
            System.out.print("Frase: ");
            f = in.readLine();

            fOUT.println(f);

            fOUT.flush();
            fOUT.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void Visual(){
        String frasi;
        try{
            FileReader fr = new FileReader(nomeFile);
            BufferedReader fIN = new BufferedReader(fr);

            frasi = fIN.readLine();
            while(frasi!=null){
                System.out.println(frasi);
                frasi = fIN.readLine();
            }
            fIN.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}