package squadreItalia_Natale;/*
Author: Durante Giovanni
Date: 05/01/2021
Object: Programma di java che consente di gestire un archivio creato dall'utente in modo che:
- visualizzi il contenuto
- esegua la ricerca del contenuto
- aggiunga voci possibili
- esegua un backup
-eseguire un ordinamento
Version: 1.0.0
*/

import java.io.*;
import java.util.*;
class Archivio{
    //Dichiarazione attributi
    String file;
    //Costruttore
    Archivio(String file){
        this.file = file;
    }
    
    //Metodi
    void visual(){
        String dati;
        try{
            FileReader fr = new FileReader(file);
            BufferedReader fIn = new BufferedReader(fr);
            
            dati = fIn.readLine();
            while(dati!=null){
                System.out.println(dati);
                dati = fIn.readLine();
            }
            fIn.close();
        }catch(Exception e){
            System.out.println("Invalid read file");
        }
    }
    void resStadium(String res){   //metodo che ricerca il nome dello stadio
        String name;    //nome della squadra
        String region;   //regione di provenienza
        String city;       //città di appartenenza
        String sponsor; // sponsor tecnico della squadra
        String coach;    //allenatore della squadra
        String championships; //scudetti del campionato italiano
        String stadium;  //stadio della squadra
        String website;  //sito internet ufficiale della squadra
        String s; //stringa di appoggio
        StringTokenizer st; //dichiarazione StringTokenizer
        
        try{
            FileReader fr = new FileReader(file);
            BufferedReader fIn = new BufferedReader(fr);
            
            s = fIn.readLine();
            st = new StringTokenizer(s,";");
            name = st.nextToken();
            region = st.nextToken();
            city = st.nextToken();
            sponsor = st.nextToken();
            coach = st.nextToken();
            championships = st.nextToken();
            stadium = st.nextToken();
            website = st.nextToken();
            System.out.printf("%-10s %-30s %5s %10s %35s %10s %35s %44s\n","Nome","Regione","Città","Sponsor","Allenatore","Scudetti","Stadio","Sito Ufficiale");
            s = fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s,";");
                name = st.nextToken();
                region = st.nextToken();
                city = st.nextToken();
                sponsor = st.nextToken();
                coach = st.nextToken();
                championships = st.nextToken();
                stadium = st.nextToken();
                website = st.nextToken();
                if(stadium.compareTo(res)==0){
                    System.out.printf("%-10s %-30s %15s %10s %35s %10s %35s %44s\n",name,region,city,sponsor,coach,championships,stadium,website);
                }
                s = fIn.readLine();
            }
            fIn.close();
        }catch(Exception e){
            System.out.println("Error. Unable to search");
        }
    }
    void resRegion(String reg){   //metodo che ricerca la regione della squadra
        String name;    //nome della squadra
        String region;   //regione di provenienza
        String city;       //città di appartenenza
        String sponsor; // sponsor tecnico della squadra
        String coach;    //allenatore della squadra
        String championships; //scudetti del campionato italiano
        String stadium;  //stadio della squadra
        String website;  //sito internet ufficiale della squadra
        String s;
        StringTokenizer st;
        
        try{
            FileReader fr = new FileReader(file);
            BufferedReader fIn = new BufferedReader(fr);
            
            s = fIn.readLine();
            st = new StringTokenizer(s,";");
            name = st.nextToken();
            region = st.nextToken();
            city = st.nextToken();
            sponsor = st.nextToken();
            coach = st.nextToken();
            championships = st.nextToken();
            stadium = st.nextToken();
            website = st.nextToken();
            System.out.printf("%-10s %-30s %5s %10s %35s %10s %35s %44s\n","Nome","Regione","Città","Sponsor","Allenatore","Scudetti","Stadio","Sito Ufficiale");
            s = fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s,";");
                name = st.nextToken();
                region = st.nextToken();
                city = st.nextToken();
                sponsor = st.nextToken();
                coach = st.nextToken();
                championships = st.nextToken();
                stadium = st.nextToken();
                website = st.nextToken();
                if(region.compareTo(reg)==0){
                    System.out.printf("%-10s %-30s %15s %10s %35s %10s %35s %44s\n",name,region,city,sponsor,coach,championships,stadium,website);
                }
                s = fIn.readLine();
            }
            fIn.close();
        }catch(Exception e){
            System.out.println("Invalid value");
        }
    }
    void backUp(boolean modS){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);
        
        String back;
        try{
            FileWriter fw = new FileWriter(file+".bak",modS);
            PrintWriter fOut = new PrintWriter(fw);
            back = in.readLine();
            
            fOut.println(back);
            fOut.close();
        }catch(Exception e){
            System.out.println("Invalid value");
        }
    }
    void sortStadium(){
        String name;    //nome della squadra
        String region;   //regione di provenienza
        String city;       //città di appartenenza
        String sponsor; // sponsor tecnico della squadra
        String coach;    //allenatore della squadra
        String championships; //scudetti del campionato italiano
        String stadium;  //stadio della squadra
        String website;  //sito internet ufficiale della squadra
        String s;
        StringTokenizer st;
        int i = 0;
        int j = 0;
        int n = 21;
        Team[] t = new Team[n];
        Team temp;
        
        try{
            FileReader fr = new FileReader(file);
            BufferedReader fIn = new BufferedReader(fr);
            
            s = fIn.readLine();
            st = new StringTokenizer(s,";");
            name = st.nextToken();
            region = st.nextToken();
            city = st.nextToken();
            sponsor = st.nextToken();
            coach = st.nextToken();
            championships = st.nextToken();
            stadium = st.nextToken();
            website = st.nextToken();
            System.out.printf("%-10s %-30s %5s %10s %35s %10s %35s %44s\n","Nome","Regione","Città","Sponsor","Allenatore","Scudetti","Stadio","Sito Ufficiale");
            s = fIn.readLine();
            while(s!=null){
                st = new StringTokenizer(s,";");
                name = st.nextToken();
                region = st.nextToken();
                city = st.nextToken();
                sponsor = st.nextToken();
                coach = st.nextToken();
                championships = st.nextToken();
                stadium = st.nextToken();
                website = st.nextToken();
                t[i] = new Team(name, region,city,sponsor, coach,championships, stadium,website);
                s = fIn.readLine();
                i++;
            }
            for(i = 0;i < n - 1;i++){
                for(j = i + 1;j<n;j++){
                    if(t[i].stadium.compareTo(t[j].stadium)>0){
                        temp = t[i];
                        t[i] = t[j];
                        t[j] = temp;
                    }
                }
            }
            for(i = 0;i < n;i++){
                System.out.printf("%10s %30s %15s %10s %35s %10s %35s %44s\n",t[i].name,t[i].region,t[i].city,t[i].sponsor,t[i].coach,t[i].championships,t[i].stadium,t[i].website);
            }
            fIn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}