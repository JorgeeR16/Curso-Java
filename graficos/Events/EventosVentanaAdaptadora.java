package graficos.Events;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosVentanaAdaptadora {
    public static void main(String[] args) {
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setTitle("Ventana 1");
        miMarco.setBounds(200, 300, 500, 350);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana miMarco2 = new MarcoVentana();
        miMarco2.setTitle("Ventana 2");
        miMarco2.setBounds(800, 300, 500, 350);
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}

class MarcoVentana extends JFrame {
    public MarcoVentana() {
        // setTitle("Respondiendo");
        // setBounds(300, 300, 500, 350);
        setVisible(true);
        /*
         * 
         * M_Ventana miVentana = new M_Ventana();
         * addWindowListener(miVentana);
         */
        addWindowListener(new M_Ventana());
    }
}

class M_Ventana extends WindowAdapter {

    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");

    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Pagina ");
    }

}