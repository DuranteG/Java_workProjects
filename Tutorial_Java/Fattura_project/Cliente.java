public class Cliente {
    private String nome;
    private String partitaIva;
    private double saldo;

    Cliente(String nome, String partitaIva){
        this.nome = nome;
        this.partitaIva = partitaIva;
    }
    Cliente(){
        nome = "";
        partitaIva = "";
        saldo = 0.0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getNome() {
        return nome;
    }
    public String getPartitaIva() {
        return partitaIva;
    }
    public double getSaldo() {
        return saldo;
    }


    public void addebita(double importo){
        this.saldo += importo;
    }
    public void paga(double importo){
        this.saldo -= importo;
    }

    public void stampaSituazione(){
        System.out.println("---------------");
        System.out.println("Cliente "+getNome());
        System.out.println("Partita IVA: "+getPartitaIva());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("-----------------");
    }

}
