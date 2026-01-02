package Coda;

import java.util.Vector;
public class Coda {
    private Vector elementi;

    Coda(){
        elementi = new Vector();
    }

    public void aggiungi(Object obj){
        elementi.addElement(obj);
    }
    public Object togli(){
        Object obj = null;
        int size = elementi.size();

        if(size > 0){
            obj = elementi.elementAt(0);
            elementi.removeElementAt(0);
        }
        return obj;
    }
    public boolean vuota(){
        if(this.size() > 0){
            return false;
        }else{
            return true;
        }
    }
    public int size(){
        return elementi.size();
    }
}
