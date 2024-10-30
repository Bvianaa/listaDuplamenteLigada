package controller;

import model.Musica;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class PlaylistController {
    private LinkedList<Musica> playlist;

    public PlaylistController() {
        playlist = new LinkedList<>();
    }

    public void inserirMusica() {
        String nome = JOptionPane.showInputDialog("Nome da Música:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID da Música:"));
        String artista = JOptionPane.showInputDialog("Artista:");
        String link = JOptionPane.showInputDialog("Link do YouTube:");

        Musica musica = new Musica(nome, id, artista, link);
        playlist.add(musica);
    }

    public void removerMusica() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID da Música a ser removida:"));
        ListIterator<Musica> iterator = playlist.listIterator();
        while (iterator.hasNext()) {
            Musica musica = iterator.next();
            if (musica.getId() == id) {
                iterator.remove();
                JOptionPane.showMessageDialog(null, "Música removida com sucesso!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Música não encontrada!");
    }

    public void pesquisarMusica() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID da Música:"));
        for (Musica musica : playlist) {
            if (musica.getId() == id) {
                JOptionPane.showMessageDialog(null, musica.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Música não encontrada!");
    }

    public void exibirPlaylist() {
        StringBuilder sb = new StringBuilder();
        for (Musica musica : playlist) {
            sb.append(musica.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public void atualizarMusica() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID da Música a ser atualizada:"));
        for (Musica musica : playlist) {
            if (musica.getId() == id) {
                String novoNome = JOptionPane.showInputDialog("Novo Nome da Música:", musica.getNomeDaMusica());
                String novoArtista = JOptionPane.showInputDialog("Novo Artista:", musica.getArtista());
                String novoLink = JOptionPane.showInputDialog("Novo Link do YouTube:", musica.getLinkDoYouTube());

                musica.setNomeDaMusica(novoNome);
                musica.setArtista(novoArtista);
                musica.setLinkDoYouTube(novoLink);
                JOptionPane.showMessageDialog(null, "Música atualizada com sucesso!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Música não encontrada!");
    }
}
