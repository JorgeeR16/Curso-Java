package graficos;

import java.awt.*;
import javax.swing.*;

public class EscribiendoEnMarco {
    public static void main(String[] args) {
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConTexto extends JFrame {

    public MarcoConTexto() {
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Primer texto");
        Lamina mLamina = new Lamina();
        add(mLamina);
        
    }
}

class Lamina extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estamos apendriendo Swing", 100,100);
    }
}