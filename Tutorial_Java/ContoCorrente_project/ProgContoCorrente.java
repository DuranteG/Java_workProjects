import java.io.*;
public class ProgContoCorrente {
    public static void main(String[] args) {
        //Rappresentare un conto corrente e gestire operazioni di versamento e prelevamento
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        double importo = 0.00;
        String s;
        ContoCorrente cc = new ContoCorrente();

        try{
            System.out.print("Versa una cifra nel conto: ");
            s = in.readLine();
            importo = Double.parseDouble(s);
            cc.versa(importo);
            cc.stampaSaldo();

            System.out.print("Preleva una cifra nel conto: ");
            s = in.readLine();
            importo = Double.parseDouble(s);
            if(cc.getSaldo() >= importo){
                cc.preleva(importo);
                cc.stampaSaldo();
            }else{
                System.out.println("Prelevamento non disponibile");
            }
        }catch(Exception e){}
    }
}
