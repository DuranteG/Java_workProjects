public class Persona {
    String nome = "Luca";
    String cognome = "Rossi";


    Persona (String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    void saluta(){
        System.out.println("Ciao sono "+nome+" "+cognome);
    }
    public String toString(){
        String stringa = this.nome +" "+ this.cognome;
        return stringa;
    }
}
