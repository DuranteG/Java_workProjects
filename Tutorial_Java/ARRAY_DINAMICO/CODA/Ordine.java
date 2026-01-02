package Coda;

public class Ordine {
    private String tavolo;
    private String ordine;

    Ordine(String tavolo, String ordine){
        this.tavolo = tavolo;
        this.ordine = ordine;
    }
    Ordine(){
        tavolo = "";
        ordine = "";
    }

    public void setTavolo(String tavolo) {
        this.tavolo = tavolo;
    }
    public void setOrdine(String ordine) {
        this.ordine = ordine;
    }

    public String getTavolo() {
        return tavolo;
    }

    public String getOrdine() {
        return ordine;
    }

    public void stampa(){
        System.out.println("Tavolo: "+tavolo);
        System.out.println("Coda.Ordine: "+ordine);
    }
}
