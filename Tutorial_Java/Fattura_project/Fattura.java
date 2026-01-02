public class Fattura {
    private final int percIVA = 20;
    private Cliente c;
    public String descrizione;
    public int qta;
    public double prezzoUnitario;
    static int numeroFatture;

    Fattura(Cliente c){
        this.c = c;
        numeroFatture++;
    }
     private double calcolaImponibile(){
        return (qta * prezzoUnitario);
     }
     private double calcolaImposta(){
        double imp = calcolaImponibile();
        return (imp * percIVA)/100;
     }
     private double totaleFattura(){
        double totale;
        totale = calcolaImponibile() + calcolaImposta();
        return totale;
     }

     static void mostraNumFatture(){
        System.out.println("Il numero di fatture create è: "+numeroFatture);
     }

     public void emettiFattura(){
        double totale = totaleFattura();
        System.out.println("Totale fattura:  "+totale);

        c.addebita(totale);
        c.stampaSituazione();
     }
}
