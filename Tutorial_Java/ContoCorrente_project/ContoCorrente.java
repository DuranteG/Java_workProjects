public class ContoCorrente {
    private double saldo;

    ContoCorrente(double saldo){
        this.saldo = saldo;
    }
    ContoCorrente(){
        saldo = 0.00;
    }

    public void versa(double importo){
        saldo += importo;
    }
    public void preleva(double importo){
        saldo -= importo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void stampaSaldo(){
        System.out.println("Saldo: "+saldo);
    }
}
