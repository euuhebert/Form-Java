package form;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Formulário");
            frame.setSize(300, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.setLocationRelativeTo(null);
            panel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(5, 5, 5, 5);

            JLabel cpf = new JLabel("CPF");
            JLabel nome = new JLabel("Nome");
            JLabel idade = new JLabel("Idade");
            JLabel curso = new JLabel("Curso");

            JTextField cpfField = new JTextField(15);
            JTextField nomeField = new JTextField(15);
            JTextField idadeField = new JTextField(15);
            JTextField cursoField = new JTextField(15);

            JButton cadastrar = new JButton("Cadastrar");
            JButton cancelar = new JButton("Cancelar");

            JTextArea output = new JTextArea(5, 20);

            //Posicionando elementos
            gbc.gridx = 0;
            gbc.gridy = 0;
            panel.add(cpf, gbc);

            gbc.gridy = 1;
            panel.add(nome, gbc);

            gbc.gridy = 2;
            panel.add(idade, gbc);

            gbc.gridy = 3;
            panel.add(curso, gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            panel.add(cpfField, gbc);

            gbc.gridy = 1;
            panel.add(nomeField, gbc);

            gbc.gridy = 2;
            panel.add(idadeField, gbc);

            gbc.gridy = 3;
            panel.add(cursoField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 4;
            gbc.gridwidth = 2;
            gbc.anchor = GridBagConstraints.CENTER;
            panel.add(cadastrar, gbc);

            gbc.gridy = 5;
            panel.add(cancelar, gbc);

            gbc.gridy = 6;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weighty = 1.0;
            panel.add(output, gbc);

            frame.add(panel);
            frame.setVisible(true);
            
            //Eventos
            cadastrar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String cpfText = cpfField.getText();
                    String nomeText = nomeField.getText();
                    String idadeText = idadeField.getText();
                    String cursoText = cursoField.getText();

                    String info = "CPF: " + cpfText +
                                  "\nNome: " + nomeText +
                                  "\nIdade: " + idadeText +
                                  "\nCurso: " + cursoText +
                                  "\nEstá devidamente Cadastrado!";

                    output.setText(info);
                }
            });
            
            cancelar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	cpfField.setText("");
                	nomeField.setText("");
                	idadeField.setText("");
                	cursoField.setText("");
                	output.setText("");
                }
            });
            
        });
    }
}


