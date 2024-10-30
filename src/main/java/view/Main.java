package view;

import controller.PlaylistController;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        PlaylistController controller = new PlaylistController();
        String[] options = {"Inserir Música", "Remover Música", "Pesquisar Música", "Exibir Playlist", "Atualizar Música", "Sair"};
        int choice;

        do {
            choice = JOptionPane.showOptionDialog(null, "Escolha uma operação", "Playlist de Músicas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    controller.inserirMusica();
                    break;
                case 1:
                    controller.removerMusica();
                    break;
                case 2:
                    controller.pesquisarMusica();
                    break;
                case 3:
                    controller.exibirPlaylist();
                    break;
                case 4:
                    controller.atualizarMusica();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (choice != 5);
    }
}
