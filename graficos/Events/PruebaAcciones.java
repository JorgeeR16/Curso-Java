package graficos.Events;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {
    public static void main(String[] args) {
        MarcoAccion marco = new MarcoAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}

class MarcoAccion extends JFrame {
    public MarcoAccion() {
        setTitle("Prueba Acciones");
        setBounds(600, 350, 600, 300);
        PanelAccion lamina = new PanelAccion();
        add(lamina);

    }
}

class PanelAccion extends JPanel {

    public PanelAccion() {
        AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("graficos/Events/Amarillo.gif"),
                Color.YELLOW);
        AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("graficos/Events/Azul.gif"), Color.BLUE);
        AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("graficos/Events/Rojo.gif"), Color.RED);

        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));

        // JButton botonAmarillo = new JButton("Amarillo");
        // JButton botonAzul = new JButton("Azul");
        // JButton botonRojo = new JButton("Rojo");
        // add(botonAmarillo);
        // add(botonAzul);
        // add(botonRojo);

        InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
        KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
        mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
        mapaEntrada.put(teclaAzul, "fondo_azul");
        mapaEntrada.put(teclaRojo, "fondo_rojo");
        ActionMap mapaAccion = getActionMap();
        mapaAccion.put("fondo_amarillo", accionAmarillo);
        mapaAccion.put("fondo_azul", accionAzul);
        mapaAccion.put("fondo_rojo", accionRojo);

    }

    private class AccionColor extends AbstractAction {// AbstractAction es una clase de tipo Action

        public AccionColor(String nombre, Icon icono, Color color_boton) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
            putValue("color_de_fondo", color_boton);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color_de_fondo");
            System.out.println("Nombre: " + getValue(Action.NAME));
            setBackground(c);
        }
    }
}
