package graficos.Layouts;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextoArea {
    public static void main(String[] args) {
        MarcoArea miMarco = new MarcoArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoArea extends JFrame {
    public MarcoArea() {
        setBounds(500, 300, 500, 350);
        LaminaArea miLamina = new LaminaArea();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaArea extends JPanel {
    private JTextArea miArea;

    public LaminaArea() {
        miArea = new JTextArea(8, 20);
        JScrollPane laminaBarras = new JScrollPane(miArea);
        miArea.setLineWrap(true);
        add(laminaBarras);

        JButton miBototn = new JButton("Dale");
        miBototn.addActionListener(new GestionaArea());
        add(miBototn);
    }

    private class GestionaArea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(miArea.getText());

        }
    }
}
