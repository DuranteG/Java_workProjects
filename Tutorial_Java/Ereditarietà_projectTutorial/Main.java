public class Main {
    public static void main(String[] args) {
        //oggetti diversi ma della stessa istanza di classe

        Persona p1 = new Persona("Luca","Rossi");

        Cerchio c1 = new Cerchio();

        c1.setRaggio(0.75);

        Studente s = new Studente("Luca","Rossi","Italiano");
        Insegnante i = new Insegnante("Stefano","Galasso","Informatica");

        p1.saluta();
        s.saluta();
        i.saluta();

        System.out.println(p1);
        System.out.println(c1.area());
    }
}
