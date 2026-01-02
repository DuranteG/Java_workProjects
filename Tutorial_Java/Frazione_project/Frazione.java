public class Frazione {
    private int numeratore;
    private int denominatore;

    Frazione(int num,int den){
        if(num > 0){
            this.numeratore = num;
        }
        if(den > 0){
            this.denominatore = den;
        }
    }
    Frazione(){
        numeratore = 0;
        denominatore = 0;
    }

    public void setNumeratore(int numeratore){
        this.numeratore = numeratore;
    }
    public void setDenominatore(int denominatore){
        this.denominatore = denominatore;
    }

    public int getNumeratore(){
        return numeratore;
    }
    public int getDenominatore() {
        return denominatore;
    }

    private int calcolaMCD(int a, int b){
        int temp, resto;
        //ordino i valori
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }

        resto = a % b;

        while(resto != 0){
            a = b;
            b = resto;
            resto = a % b;
        }
        return b;
    }

    public boolean semplifica(){
        int mcd = this.calcolaMCD(numeratore,denominatore);

        if(mcd != 1){
            numeratore = numeratore / mcd;
            denominatore = denominatore / mcd;
            return true;
        }
        return false;
    }

    public void mostraFrazione(){
        System.out.println(numeratore);
        System.out.println("------------");
        System.out.println(denominatore);
    }
}
