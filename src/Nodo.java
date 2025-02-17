public class Nodo {

    int dato;  //Dato che conterra il nostro nodo
    Nodo nextN;// Puntatore che puntera al prossimo nodo


    public Nodo(int dato){

        this.dato=dato;

        this.nextN=null; // Il primo nodo puntera a Null
    }

    public Object getDato(){
        return dato;
    }
    public Nodo getLink() {
        return nextN;
    }

    public void setLink(Nodo Link){

        this.nextN= nextN;
    }

    public void  setDati(int dato){

        this.dato=dato;
    }
}
