package graficos.Events;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosRaton {
    public static void main(String[] args) {
        MarcoRaton miMarco = new MarcoRaton();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton extends JFrame {
    public MarcoRaton() {
        // setTitle("Respondiendo");
        setBounds(300, 300, 500, 350);
        setVisible(true);
        //addMouseListener(new EventosDeRaton());
        addMouseMotionListener(new EventosDeRaton());
    }
}

class EventosDeRaton implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo el raton");
        
    }
    
}

/*
 * /
 *  extends MouseAdapter implements {
 * // @Override
 * // public void mouseClicked(MouseEvent e) {
 * // System.out.println("Haz hecho clic");
 * // //
 * System.out.println("Coordenada X: "+e.getX()+" Coordenada Y: "+e.getY());
 * // // System.out.println(e.getClickCount());
 * // }
 * 
 * @Override
 * public void mousePressed(MouseEvent e) {
 * if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
 * System.out.println("Boton izquierdo");
 * } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
 * System.out.println("Pulsado la rueda");
 * } else {
 * System.out.println("Pulsado derecho");
 * }
 * }
 * }
 */

/*
 * class EventosDeRaton implements MouseListener {
 * 
 * @Override
 * public void mouseClicked(MouseEvent e) {
 * System.out.println("Haz hecho clic");
 * }
 * 
 * @Override
 * public void mousePressed(MouseEvent e) {
 * System.out.println("Acabas de presionar");
 * }
 * 
 * @Override
 * public void mouseReleased(MouseEvent e) {
 * System.out.println("Acabas de Levantar");
 * }
 * 
 * @Override
 * public void mouseEntered(MouseEvent e) {
 * System.out.println("Acabas de entrar");
 * }
 * 
 * @Override
 * public void mouseExited(MouseEvent e) {
 * System.out.println("Acabas de salir");
 * }
 * 
 * }
 */
