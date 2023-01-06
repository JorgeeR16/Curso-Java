package graficos.Events;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosVentana {
    public static void main(String[] args) {
        MarcoVentana1 miMarco = new MarcoVentana1();
        miMarco.setTitle("Ventana 1");
        miMarco.setBounds(200, 300, 500, 350);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana1 miMarco2 = new MarcoVentana1();
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(800, 300, 500, 350);
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}

class MarcoVentana1 extends JFrame {
    public MarcoVentana1() {
        // setTitle("Respondiendo");
        // setBounds(300, 300, 500, 350);
        setVisible(true);
        addWindowListener(new M_Ventana1());
    }
}

class M_Ventana1 implements WindowListener {

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Se minimizo la pantalla");

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}