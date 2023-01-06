package graficos.Layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

public class PruebaTexto {
    public static void main(String[] args) {

        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // miMarco.setVisible(true);
    }
}

class MarcoTexto extends JFrame {
    public MarcoTexto() {
        setBounds(600, 300, 600, 350);
        LaminaTexto miLamina = new LaminaTexto();
        add(miLamina);
        setVisible(true);

    }
}

class LaminaTexto extends JPanel {
    private JTextField campo1;
    private JLabel resultado;

    public LaminaTexto() {
        resultado = new JLabel();
        add(new JLabel("Email: "));
        campo1 = new JTextField(20);
        add(campo1);
        add(resultado);
        JButton miBoton = new JButton("Comprobar");
        miBoton.addActionListener(new DameTexto());
        add(miBoton);
    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int correcto = 0;
            String email = campo1.getText().trim();
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    correcto++;
                }
            }
            if (correcto != 1) {
                resultado.setText("Incorrecto");
            } else {
                resultado.setText("Correcto");
            }
        }
    }
}