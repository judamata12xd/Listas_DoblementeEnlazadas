public class Listadoble {

    private Nodo inicio;
    private Nodo fin;


    public Listadoble() {
    }

    public Listadoble(Nodo inicio, Nodo fin) {
        this.inicio = null;
        this.fin = null;
    }


    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
}
