public class Anagrafica {
    private String name;
    private String cognome;
    private String email;
    private boolean registrata;

    Anagrafica(String nome,String cognome,String email,boolean registrata){
        this.name = nome;
        this.cognome = cognome;
        this.email = email;
        this.registrata = registrata;
    }
    Anagrafica(){
        name = "";
        cognome = "";
        email = "";
        registrata = false;
    }
    Anagrafica (String nome, String cognome){
        this.name = nome;
        this.cognome = cognome;
    }
    public void setEmail(String email){
        this.email = email;
        registrata = true;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String getCognome() {
        return cognome;
    }
    public String getEmail(){
        return email;
    }
    public void stampaDati(){
        System.out.println("Nome: "+getName());
        System.out.println("Cognome: "+getCognome());
        if(registrata){
            System.out.println("Email: "+getEmail());
        }else{
            System.out.println("Email non registrata");
        }
    }
}
