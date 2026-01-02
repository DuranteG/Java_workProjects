public class Cerchio {
    private double r;

    Cerchio(double raggio){
        this.r = raggio;
    }
    Cerchio(){
        r = 0.00;
    }

    public void setRaggio(double raggio) {
        this.r = raggio;
    }
    public double getRaggio() {
        return r;
    }
    public double area(){
        return (this.getRaggio() * this.getRaggio() * Math.PI);
    }
}
