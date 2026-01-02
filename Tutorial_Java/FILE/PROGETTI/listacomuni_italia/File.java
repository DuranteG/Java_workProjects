package listacomuni;
/*
Autore: Durante Giovanni
data: 14-12-2020
oggetto:  fare una classe per la gestione del file che svolga le seguenti funzioni:
- legge il file cosi come è, cioè ogni riga senza distinguere i vari campi
- Legge il file visualizzando bene i vari campi distanziati da qualcosa che volete voi
-Crea un file di backUp del file archivio "comuni"
*/

import java.io.*;
import java.util.*;
class File{
    //Attributi
    String istat,comune,provincia,regione,prefisso,CAP,codFisco,abitanti,link;
    String file;
    //Costruttore
    File(String file){
        this.file = file;
    }
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(input);
    //Metodi
    void visual(){
        String dati;
        try{
            FileReader fr=new FileReader(file);
            BufferedReader fIn=new BufferedReader(fr);
            // apro gli stream dei file
            //Uno stream è un canale logico per leggere o scrivere dati da/verso
            //diverse sorgenti (file, tastiera, rete) usando le stesse funzioni, semplificando il codice.
            dati=fIn.readLine();
            while(dati!=null){
                System.out.println(dati);
                dati=fIn.readLine();
            }
            fIn.close();    // chiusura file
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    void ricerca(String reg){
        String s;
        StringTokenizer st;
        try{
            FileReader fr = new FileReader(file);
            BufferedReader fIn = new BufferedReader(fr);
            
            s = fIn.readLine();
            st = new StringTokenizer(s,";");
            istat=st.nextToken();
            comune=st.nextToken();
            provincia=st.nextToken();
            regione=st.nextToken();
            prefisso=st.nextToken();
            CAP=st.nextToken();
            codFisco=st.nextToken();
            abitanti=st.nextToken();
            link=st.nextToken();
            System.out.printf("%-10s %-35s %7s %15s %15s %14s %13s %10s %44s\n","Istat","Comune","Provincia","Regione","Prefisso","CAP","codFisco","abitanti","Link");
            s = fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s,";");
                    istat=st.nextToken();
                    comune=st.nextToken();
                    provincia=st.nextToken();
                    regione=st.nextToken();
                    prefisso=st.nextToken();
                    CAP=st.nextToken();
                    codFisco=st.nextToken();
                    abitanti=st.nextToken();
                    link=st.nextToken();
                    if((regione.compareTo(reg))==0){
                        System.out.printf("%-10s %-35s %7s %15s %15s %14s %13s %10s %44s\n",istat,comune,provincia,regione,prefisso,CAP,codFisco,abitanti,link);
                    }
                s = fIn.readLine();
            }
            fIn.close();
        }catch(Exception e){
            System.out.println("Errore lettura del file");
        }
    }
    void ric(String pro){
        String s;
        StringTokenizer st;
        try{
            FileReader fr = new FileReader(file);
            BufferedReader fIn = new BufferedReader(fr);
            
            s = fIn.readLine();
            st = new StringTokenizer(s,";");
            istat=st.nextToken();
            comune=st.nextToken();
            provincia=st.nextToken();
            regione=st.nextToken();
            prefisso=st.nextToken();
            CAP=st.nextToken();
            codFisco=st.nextToken();
            abitanti=st.nextToken();
            link=st.nextToken();
            System.out.printf("%-10s %-35s %7s %15s %15s %14s %13s %10s %44s\n","Istat","Comune","Provincia","Regione","Prefisso","CAP","codFisco","abitanti","Link");
            s = fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s,";");
                    istat=st.nextToken();
                    comune=st.nextToken();
                    provincia=st.nextToken();
                    regione=st.nextToken();
                    prefisso=st.nextToken();
                    CAP=st.nextToken();
                    codFisco=st.nextToken();
                    abitanti=st.nextToken();
                    link=st.nextToken();
                    if((provincia.compareTo(pro))==0){
                        System.out.printf("%-10s %-35s %7s %15s %15s %14s %13s %10s %44s\n",istat,comune,provincia,regione,prefisso,CAP,codFisco,abitanti,link);
                    }
                s = fIn.readLine();
            }
            fIn.close();
        }catch(Exception e){
            System.out.println("Errore lettura del file");
        }
    }
    void backup(boolean modS){
        String s;
        try{
            FileWriter fw = new FileWriter(file+".bak",modS);
            PrintWriter fOut = new PrintWriter(fw);
            s = in.readLine();
            
            fOut.println(s);

            fOut.flush();
            fOut.close();
        }catch(Exception e){
            System.out.println("Errore per riprodurre file in backup");
        }
    }
}

