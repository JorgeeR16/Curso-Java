package graficos.Layouts;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCombo {
    public static void main(String[] args) {
        MarcoCombo miMarco = new MarcoCombo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCombo extends JFrame {
    public MarcoCombo() {
        setBounds(550, 300, 550, 400);
        LaminaCombo miLamina = new LaminaCombo();
        add(miLamina);

    }
}

class LaminaCombo extends JPanel {
    private JLabel texto;
    private JComboBox micombo;

    public LaminaCombo() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha cuyo nombre.....");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        JPanel lamina_norte = new JPanel();
        micombo = new JComboBox();
        micombo.addItem("Serif");
        micombo.addItem("SansSerif");
        micombo.addItem("Monospaced");
        micombo.addItem("Dialog");
        micombo.addActionListener(new Evento_Combo());
        lamina_norte.add(micombo);
        add(lamina_norte, BorderLayout.NORTH);

    }

    private class Evento_Combo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN, 18));
            
        }

    }
}