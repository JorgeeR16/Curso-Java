package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConDibujos extends JFrame {
    public MarcoConDibujos() {
        setTitle("Prueba de dibujo");
        setSize(400, 400);
        setVisible(true);
        LaminaConFiguras dibujo = new LaminaConFiguras();
        add(dibujo);
    }
}

class LaminaConFiguras extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);
        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 10;
        Ellipse2D ciculo = new Ellipse2D.Double(); 
        ciculo.setFrameFromCenter(centroX,centroY,centroX+radio,centroY+radio);
        g2.draw(ciculo);
        
    }
}
