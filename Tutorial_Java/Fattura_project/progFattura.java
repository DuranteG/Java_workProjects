import java.io.*;
public class progFattura {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(input);

        Cliente cliente = new Cliente();
        String nome;
        String iva;
        String s;
        double bonifico = 0;
        int n = 0;

        try{
            System.out.print("Inserisci nome cliente: ");
            nome = in.readLine();
            cliente.setNome(nome);

            System.out.print("Inserisci partita IVA cliente: ");
            iva = in.readLine();
            cliente.setPartitaIva(iva);

            cliente = new Cliente(nome,iva);

            System.out.print("Inserisci fatture da ricevere: ");
            s = in.readLine();
            n = Integer.parseInt(s);
            Fattura[] f_cliente = new Fattura[n];
            Fattura f;

            for(int i = 0;i < f_cliente.length;i++){
                f = new Fattura(cliente);
                System.out.print("Inserisci nome prodotto: ");
                f.descrizione = in.readLine();

                System.out.print("Inserisci quantità prodotto: ");
                s = in.readLine();
                f.qta = Integer.parseInt(s);

                System.out.print("Inserisci prezzo prodotto: ");
                s = in.readLine();
                f.prezzoUnitario = Double.parseDouble(s);

                f.emettiFattura();
                f_cliente[i] = f;
            }
            Fattura.mostraNumFatture();

            System.out.print("Inserisci cifra da pagare: ");
            s = in.readLine();
            bonifico = Double.parseDouble(s);

            cliente.paga(bonifico);
            cliente.stampaSituazione();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
