package Ex2;

import Ex1.ValidadorCpf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eleicao extends JFrame {
    private JPanel guiEleicao;
    private JFormattedTextField votosTextField;
    private JButton votarButton;
    private JButton cancelarButton;
    private JButton apurarButton;
    private int maria, pedro, nulo, branco;

    public Eleicao() {
        votarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int menu = Integer.parseInt(votosTextField.getText().replace("", ""));
                switch (menu) {
                    case 1:
                        nulo++;
                        votosTextField.setText("");
                        break;
                    case 2:
                        branco++;
                        votosTextField.setText("");
                        break;
                    case 30:
                        pedro++;
                        votosTextField.setText("");
                        break;
                    case 20:
                        maria++;
                        votosTextField.setText("");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ENTRADA INVALIDA");
                        break;
                }
            }
        });


        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                votosTextField.setText("");
            }
        });
        apurarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pedro==maria) {
                    JOptionPane.showMessageDialog(null, String.format("Votos em Branco: " + branco + "\nVotos Nulos: " + nulo
                            + "\nVotos da Maria: " + maria + "\nVotos do Pedro: "+pedro+"\nEMPATE!!"));
                }else if(pedro>maria){
                    JOptionPane.showMessageDialog(null, String.format("Votos em Branco: " + branco + "\nVotos Nulos: " + nulo
                            + "\nVotos da Maria: " + maria + "\nVotos do Pedro: "+pedro+"\nPEDRO ELEITO"));
                }else{
                    JOptionPane.showMessageDialog(null, String.format("Votos em Branco: " + branco + "\nVotos Nulos: " + nulo
                            + "\nVotos da Maria: " + maria + "\nVotos do Pedro: "+pedro+"\nMARIA ELEITA"));
                }
            }
        });
    }


    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao();
        eleicao.setContentPane(eleicao.guiEleicao);
        eleicao.setTitle("ELEIÇÃO");
        eleicao.setSize(450, 300);
        eleicao.setVisible(true);
        eleicao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
