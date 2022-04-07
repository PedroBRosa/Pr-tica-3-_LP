package Ex2;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eleicao {
    private JTextField votoTextField;
    private JButton cancelarButton;
    private JButton votarButton;
    private JButton apurarButton;
    private int candidato1, candidato2, votoNulo, branco, eleito;

    public Eleicao(JTextField textField1, JButton cancelarButton, JButton votarButton, JButton apuararButton) {
        this.votoTextField = votoTextField;
        this.cancelarButton = cancelarButton;
        this.votarButton = votarButton;
        this.apurarButton = apuararButton;
        votarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int menu = Integer.parseInt(votoTextField.getText().replace("0", ""));
                switch (menu) {
                    case 1:
                        votoNulo++;
                        break;

                    case 2:
                        branco++;
                        break;

                    case 20:
                        candidato1++;
                        break;

                    case 30:
                        candidato2++;
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
                votoTextField.setText("");
            }
        });

        apurarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (apurar() == -1) {
                    JOptionPane.showMessageDialog(null, String.format("Votos em Branco: " + branco + "/n Votos Nulos: " + votoNulo
                            + "Votos da Maria: " + candidato1 + "Votos do Pedro: "));
                }
            }
        });
    }

    public int apurar() {
        if (candidato1 > candidato2) {
            eleito = candidato1;
        } else if (candidato1 == candidato2) {
            eleito = -1;
        } else {
            eleito = candidato2;
        }
        return eleito;
    }

}
