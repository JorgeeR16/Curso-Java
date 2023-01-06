package graficos.Events;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocoCuadroTexto {
    public static void main(String[] args) {
        MarcoFoco miMarco = new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFoco extends JFrame {
    public MarcoFoco() {

        setBounds(300, 300, 500, 350);
        setVisible(true);
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel {
    JTextField cuadro1;
    JTextField cuadro2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);

        LanzaFoco elFoco = new LanzaFoco();
        cuadro1.addFocusListener(elFoco);
    }

    private class LanzaFoco implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {
            String email = cuadro1.getText();
            boolean comprobacion = false;

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    comprobacion = true;
                }
            }
            if (comprobacion) {
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
            }
        }
    }
}
