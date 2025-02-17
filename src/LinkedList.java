public class LinkedList {
    Nodo head;
    private int numElementi;

    public LinkedList() {
        this.head = null;                    //Lista vuota
        numElementi = 0;
    }

    public void aggiungiNodo(int dato) {

        Nodo newNodo = new Nodo(dato);     // creazione di un nuovo nodo

        if (head == null) {                  //se la lista è vuota, allora il nuovo nodo diventera la testa
            head = newNodo;
        } else {                             //altrimenti, se la lista non è vuota si dovrà scorrere la lista fino
            // ad arrivare all'iìultimo nodo e poi aggiungere il nuovo nodo
            Nodo nCurrent = head;
            while (nCurrent.nextN != null) {
                nCurrent = nCurrent.nextN;
            }
            nCurrent.nextN = newNodo;
        }

    }
    public void agiungiNodoTesta(int dato) { //inserimento di un Nodo in testa

        Nodo d = new Nodo(dato);

        Nodo c = head;

        head = d;
        head.setLink(c);
        numElementi++;
    }
    public void aggiungiNodoCoda(int dato) {  //inserimento di un Nodo in coda

        Nodo d = new Nodo(dato);

        Nodo c = head;

        head = d;
        head.setLink(c);
        numElementi++;
    }

    public void aggiungiNodoInOrdine(int dato){ //inserimento di un nodo nel mezzo

        if(head ==null){
            head=new Nodo(dato);
            return;
        }

        Nodo n = new Nodo(dato);
        Nodo p = head;
        Nodo d= head.getLink();

        while(d != null && d.getDato() != dato){
            p = d;
            d=d.getLink();
        }

        if(d== null){
            aggiungiNodoCoda(dato);
        }
        else{

            n.setLink(d);
            p.setLink(n);
            numElementi++;
        }
    }

    public void StampaLista() {

        Nodo nCurrent = head;

        while (nCurrent != null) {

            System.out.println(nCurrent.dato + "si");
            nCurrent = nCurrent.nextN;
        }

        System.out.println();
    }

    public void eliminazioneIntermedia(int dato){
                                                                  //scoroo la lista finche non trovo il nodo contenente i dati
                                                                    //presi in imputa dalla funzione
                                                                    //NON SAPPIAMO LA POSIZIONE!!

                                                                  //scorriamo la lista su due nodi per poter raissegnare i collegamenti

        Nodo prima =head;
        Nodo dopo = prima.getLink();           //Nodo successivo alla testa

        while(dopo.getLink() !=null){

                                               //esco dal ciclo quando arrivo in fondo, oppire quando ho trocato il nodo che contiene i dati

            prima=dopo;
            dopo =dopo.getLink();
        }

                                               //sono uscita dal ciclo perche -> La lista è finita e non ho trocato il nodo quindo non ho nulla da eliminare
                                               //-> Ho trocato il nodo da eliminare
        if(dopo.getDato().equals(dato)){
            Nodo dopodopo = dopo.getLink();

            prima.setLink(dopodopo);
            numElementi--;
        }

    }

}

