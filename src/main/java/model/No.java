package model;

public class No {
    private Musica musica;
    private No anterior;
    private No proximo;

    public No(Musica musica) {
        this.musica = musica;
        this.anterior = null;
        this.proximo = null;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
