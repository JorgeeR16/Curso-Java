package graficos.Events;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosTeclado {
    public static void main(String[] args) {
        MarcoConTeclas miMarco = new MarcoConTeclas();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTeclas extends JFrame {
    public MarcoConTeclas() {
        // setTitle("Respondiendo");
        setBounds(300, 300, 500, 350);
        setVisible(true);
        EventoDeTeclado tecla = new EventoDeTeclado();
        addKeyListener(tecla);
    }
}

class EventoDeTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //int codigo = e.getKeyCode();
        //System.out.println(codigo);
        

    }

    @Override
    public void keyReleased(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println(c);

    }

}
