package StringTokenizer;
/*
Autore: Durante Giovanni
data: 11/12/2020
oggetto: Programma che realizza un algoritmo direttamente nel main che legge una riga da tastiera contenente campi separati da un delimitatore a piacere e poi stampa i vari campi senza il separatore.
*/

import java.util.StringTokenizer;
import java.io.*;
class TestStringTokenizer{
    public static void main(String[] args){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        
        StringTokenizer st;
        String s;//Stringa di appoggio
        String nomeFile = "/Users/giovannidurante/Desktop/Desktop/CODING/JAVA/MainTutorial/src/StringTokenizer/Archivi.txt";
        String f;// frase da inserire
        String del = " ";//delimitatore del token
        String token;//token che in parole povere è la parola tra i delimitatori
        boolean modS = true;
        
        try{
            FileWriter fw = new FileWriter(nomeFile,modS);
            PrintWriter fOut = new PrintWriter(fw);
            System.out.print("Esegui inserimento:  ");
            f = in.readLine();
            
            fOut.println(f);
            fOut.close();
        }catch(Exception e){
            System.out.println("Invalid value");
        }
        
        try{
            FileReader fr=new FileReader(nomeFile);
            BufferedReader fIN=new BufferedReader(fr);
            
            s = fIN.readLine();
            while(s != null){
                st = new StringTokenizer(s,del);
                while(st.hasMoreTokens()){
                    token = st.nextToken();
                    System.out.print(token+ "\n");
                }
                s = fIN.readLine();
            }
            fIN.close();
        }catch(Exception e){
            System.out.println("Invalid value");
        }
    }
}