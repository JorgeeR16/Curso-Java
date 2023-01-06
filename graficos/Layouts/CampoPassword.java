package graficos.Layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


import java.awt.*;

public class CampoPassword {
    public static void main(String[] args) {
        MarcoPassword miMarco = new MarcoPassword();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoPassword extends JFrame {
    public MarcoPassword() {
        setBounds(500, 300, 500, 350);
        LaminaPassword miLamina = new LaminaPassword();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaPassword extends JPanel {
    private JPasswordField cPassword;

    public LaminaPassword() {
        setLayout(new BorderLayout());
        JPanel laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2, 2));
        add(laminaSuperior, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel(" Usuario");
        JLabel etiqueta2 = new JLabel(" Contraseña");

        JTextField cUsuario = new JTextField(15);
        cPassword = new JPasswordField(15);
        cPassword.getDocument().addDocumentListener(new CompruebaPass());
        laminaSuperior.add(etiqueta1);
        laminaSuperior.add(cUsuario);
        laminaSuperior.add(etiqueta2);
        laminaSuperior.add(cPassword);
        JButton enviar = new JButton("Enviar");
        add(enviar, BorderLayout.SOUTH);

    }

    private class CompruebaPass implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            char[] contrasena;
            contrasena = cPassword.getPassword();
            if (contrasena.length < 8 || contrasena.length > 12) {
                cPassword.setBackground(Color.red);
            } else {
                cPassword.setBackground(Color.green);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char[] contrasena;
            contrasena = cPassword.getPassword();
            if (contrasena.length < 8 || contrasena.length > 12) {
                cPassword.setBackground(Color.red);
            } else {
                cPassword.setBackground(Color.green);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }

    }

}