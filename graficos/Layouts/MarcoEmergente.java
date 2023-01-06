package graficos.Layouts;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


public class MarcoEmergente {
    public static void main(String[] args) {
        MarcoEmergenteM miMarco = new MarcoEmergenteM();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoEmergenteM extends JFrame {
    public MarcoEmergenteM() {
        setBounds(550, 400, 550, 350);
        add(new LaminaEmergenteM());

    }
}

class LaminaEmergenteM extends JPanel {

    public LaminaEmergenteM() {
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        emergente.add(opcion1);
        setComponentPopupMenu(emergente);

    }
}