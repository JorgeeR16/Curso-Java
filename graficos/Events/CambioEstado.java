package graficos.Events;

import javax.swing.JFrame;

import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado {
    public static void main(String[] args) {
        MarcoEstado miMarco = new MarcoEstado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class MarcoEstado extends JFrame {
    public MarcoEstado() {
        // setTitle("Respondiendo");
        setBounds(300, 300, 500, 350);
        setVisible(true);
        CambiaEstado noevoEstado = new CambiaEstado();
        addWindowStateListener(noevoEstado);
    }
}

class CambiaEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        //System.out.println(e.getNewState());
        if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
            System.out.println("La ventana esta a pantalla completa");
        }
    }
    
}

