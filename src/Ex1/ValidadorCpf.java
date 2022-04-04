package Ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ValidadorCpf extends JFrame {
    private JFormattedTextField nomeFormattedTextField;
    private JFormattedTextField cpfFormattedTextField;
    private JButton conferirCpfButton;
    private JLabel nomeLabel;
    private JLabel CPFLabel;
    private JPanel valCpf;

    public ValidadorCpf() {
        cpfFormattedTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(cpfFormattedTextField.getText().length()>=11){
                    cpfFormattedTextField.setText(cpfFormattedTextField.getText().substring(0,10));
                }
            }
        });

        conferirCpfButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cpf cpf = new Cpf();
                if (cpf.isCPF(cpfFormattedTextField.getText())==true){

                JOptionPane.showMessageDialog(conferirCpfButton,"CPF VALIDO");
                }else{
                    JOptionPane.showMessageDialog(conferirCpfButton,"CPF FALSO");

                }
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

