package model;

public class Musica {
    private String nomeDaMusica;
    private int id;
    private String artista;
    private String linkDoYouTube;

    public Musica(String nomeDaMusica, int id, String artista, String linkDoYouTube) {
        this.nomeDaMusica = nomeDaMusica;
        this.id = id;
        this.artista = artista;
        this.linkDoYouTube = linkDoYouTube;
    }

    // Getters e Setters
    public String getNomeDaMusica() {
        return nomeDaMusica;
    }

    public void setNomeDaMusica(String nomeDaMusica) {
        this.nomeDaMusica = nomeDaMusica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getLinkDoYouTube() {
        return linkDoYouTube;
    }

    public void setLinkDoYouTube(String linkDoYouTube) {
        this.linkDoYouTube = linkDoYouTube;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Música: " + nomeDaMusica + " | Artista: " + artista + " | YouTube: " + linkDoYouTube;
    }
}
