package Ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidadorCpf extends JFrame {
    private JFormattedTextField nomeFormattedTextField;
    private JFormattedTextField cpfFormattedTextField;
    private JButton conferirCpfButton;
    private JLabel nomeLabel;
    private JLabel CPFLabel;
    private JPanel valCpf;

    public ValidadorCpf() {
        conferirCpfButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cpf cpf = new Cpf();
                JOptionPane.showMessageDialog(conferirCpfButton, cpf.isCPF(cpfFormattedTextField.getText()));
            }
        });
    }

    public static void main(String[] args) {
        ValidadorCpf vCpf =  new ValidadorCpf();
        vCpf.setContentPane(vCpf.valCpf);
        vCpf.setTitle("VALIDADOR DE CPF");
        vCpf.setSize(450,300);
        vCpf.setVisible(true);
        vCpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

