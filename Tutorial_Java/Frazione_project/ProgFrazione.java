import java.io.*;
public class ProgFrazione {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        int num = 1;
        int den = 1;
        String s;
        Frazione f;
        boolean semplificata;

        try{
            System.out.print("Inserisci numeratore: ");
            s = in.readLine();
            num = Integer.parseInt(s);

            System.out.print("Inserisci denominatore: ");
            s = in.readLine();
            den = Integer.parseInt(s);
            f = new Frazione(num,den);

            semplificata = f.semplifica();

            if (semplificata){
                f.mostraFrazione();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
