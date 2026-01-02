package Frasi;/*
Autore: Durante Giovanni
data: 04/12/2020
Oggetto: Programma che realizza un menù per scrivere una frase famosa e leggerla
*/
import java.io.*;
class TestFrasi{
    public static void main(String[] args){
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(input);
        
        String nomeFile = "/Users/giovannidurante/Desktop/Desktop/CODING/JAVA/MainTutorial/src/Frasi/Frasi.txt";
        frasi f = new frasi(nomeFile);
        String s;
        int opt = 0;
        boolean modS = true;// true = append    false = sovrascrittura
        
        do{
            System.out.println("0 --> Esci");
            System.out.println("1 --> Inserisce una frase famosa");
            System.out.println("2 --> Visualizza frasi famose inserite");
            try{
                System.out.print("Scelta: ");
                s = in.readLine();
                opt = Integer.parseInt(s);
            }catch(IOException e){
                System.out.println(e);
            }
            
            switch(opt){
                case 0:
                    System.out.println("Frasi famose finite.Arrivederci!!");
                    break;
                case 1:
                    f.input(modS);
                    break;
                case 2: 
                    f.Visual();
                    break;
            }
        }while(opt!=0);
    }
}