package squadreItalia_Natale;
/*
Author: Durante Giovanni
Date: 05/01/2021
Object: Programma di java che consente di gestire un archivio creato dall'utente in modo che:
- visualizzi il contenuto
- esegua la ricerca del contenuto
- aggiunga voci possibili
- esegua un backup
Version: 1.0.0
*/

import java.io.*;
import java.util.*;

class TestArchivio{
    public static void main (String[] args){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        
        String file = "/Users/giovannidurante/Desktop/Desktop/CODING/JAVA/MainTutorial/src/squadreItalia_Natale/squadreItalia.csv";
        Archivio a;//dichiarazione oggetto
        a = new Archivio(file);//creazione dell'oggetto
        boolean modS = false;//modalità di scrittura file
        String s;
        int opt = 0;
        String res; //variabile passata come parametro nel metodo della ricerca dello stadio
        String reg;//variabile passata come parametro nel metodo della ricerca della regione
        
        try{
            do{
                System.out.println("0 --> Exit");
                System.out.println("1 --> View archive content");
                System.out.println("2 --> Search for the common stadium");
                System.out.println("3 --> Search for the region of the team");
                System.out.println("4 --> Run backUp");
                System.out.println("5 --> Sort file");
                System.out.print("Choose: ");
                s = in.readLine();
                opt = Integer.parseInt(s);
                switch(opt){
                    case 0:
                        System.out.println("GoodBye!!!");
                        break;
                    case 1:
                        a.visual();
                        break;
                    case 2:
                        System.out.println("Insert stadium to search: ");
                        res = in.readLine();
                        a.resStadium(res);
                        break;
                    case 3:
                        System.out.println("Insert region to search: ");
                        reg = in.readLine();
                        a.resRegion(reg);
                        break;
                    case 4:
                        System.out.println("BackUp executed");
                        a.backUp(modS);
                        break;
                    case 5:
                        a.sortStadium();
                        break;
                }
            }while(opt!=0);
        }catch(IOException e){
            System.out.println("Invalid value");
        }
    }
}