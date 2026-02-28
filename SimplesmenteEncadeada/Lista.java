package SimplesmenteEncadeada;

public class Lista {
    private No primeiro;
    private No ultimo;

    public Lista () {
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
    
}