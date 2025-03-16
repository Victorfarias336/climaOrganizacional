package br.prat.climaorganizacional;

import br.prat.GUI.telaLogin;
import java.awt.FlowLayout;
import java.util.concurrent.ExecutionException;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class ClimaOrganizacional {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Criar o JDialog de carregamento
            JDialog loadingDialog = new JDialog();
            loadingDialog.setTitle("Carregando...");
            loadingDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            loadingDialog.setSize(300, 100);
            loadingDialog.setLocationRelativeTo(null);
            loadingDialog.setLayout(new FlowLayout());

            JLabel messageLabel = new JLabel("Conectando ao banco de dados...");
            loadingDialog.add(messageLabel);

            // Criar o SwingWorker para a conexão
            SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws Exception {
                    telaLogin inicio = new telaLogin();
                    inicio.setVisible(true);
                    inicio.setLocationRelativeTo(null);
                    return null;
                }

                @Override
                protected void done() {
                    try {
                        // Verificar se a conexão foi bem-sucedida
                        get(); // Lança uma exceção se houver erro na conexão

                        // Fechar o JDialog de carregamento
                        loadingDialog.dispose();
                    } catch (InterruptedException | ExecutionException ex) {
                        // Tratar a exceção de conexão
                        JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
                        loadingDialog.dispose();
                        System.exit(1);
                    }
                }
            };

            // Exibir o JDialog de carregamento
            loadingDialog.setVisible(true);

            // Iniciar o SwingWorker
            worker.execute();
        });
    }
}
