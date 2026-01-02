package listacomuni;

import java.io.*;
import java.util.*;
class TestFile{
    public static void main(String[] args){
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(input);
        
        String file = "/Users/giovannidurante/Desktop/Desktop/CODING/JAVA/MainTutorial/src/listacomuni/listacomuni.txt";
        File f; //reference
        f = new File(file);
        boolean modS = false;
        String s;
        StringTokenizer st;
        String reg;
        String pro;
        int opt = 0;
        
        try{
            do{
                System.out.println("0 --> Esci");
                System.out.println("1 --> Visualizza file");
                System.out.println("2 --> Visualizza dati del comune data la regione");
                System.out.println("3 --> Visualizza dati del comune data la provincia");
                System.out.println("4 --> Visualizza file backup");
                System.out.print("Scelta: ");
                    s = in.readLine();
                    opt = Integer.parseInt(s);
                switch (opt){
                    case 0:
                        System.out.println("Arrivederci!!!");
                        break;
                    case 1:
                        f.visual();
                        break;
                    case 2:
                        System.out.print("Inserisci regione da cercare: ");
                        reg = in.readLine();
                        f.ricerca(reg);
                        break;
                    case 3:
                        System.out.print("Inserisci provincia da cercare: ");
                        pro = in.readLine();
                        f.ric(pro);
                        break;
                    case 4:
                        f.backup(modS);
                        break;
                }
            }while(opt!=0);
        }catch(Exception e){
            System.out.println("Invalid value");
        }
    }
}