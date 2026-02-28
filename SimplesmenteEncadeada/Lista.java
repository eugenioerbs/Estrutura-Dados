package SimplesmenteEncadeada;

public class Lista {
    private No primeiro;
    private No ultimo;

    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public No getUltimo() {
        return ultimo;
    }

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoFinal (No noVari) {
        if (isEmpty() == true) {
            primeiro = noVari;
            ultimo = noVari;
        } else {
            this.ultimo.setProximo(noVari);
            this.ultimo = noVari;
        }
    }

    public void inserirNaFrente (No noVari) {
        if (isEmpty() == true) {
            primeiro = noVari;
            ultimo = noVari;
        } else {
            noVari.setProximo(this.primeiro);
            this.primeiro = noVari;
        }
    }

}// classe