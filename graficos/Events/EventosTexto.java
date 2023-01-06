package graficos.Events;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventosTexto {
    public static void main(String[] args) {
        MarcoPrueba miMarco = new MarcoPrueba();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoPrueba extends JFrame {
    public MarcoPrueba() {
        setBounds(500, 300, 500, 350);
        LaminaPrueba miLamina = new LaminaPrueba();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaPrueba extends JPanel {
    public LaminaPrueba() {
        JTextField miCampo = new JTextField(20);
        Document miDoc = miCampo.getDocument();
        miDoc.addDocumentListener(new EscuchaTexto());
        add(miCampo);
    }

    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("has insertado texto");

        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");

        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }

    }
}