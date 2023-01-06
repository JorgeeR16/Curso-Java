package graficos.Layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class BarraHerramientas {
    public static void main(String[] args) {
        BarraAccion marco = new BarraAccion();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}

class BarraAccion extends JFrame {
    private JPanel lamina;

    public BarraAccion() {
        setTitle("Marco barra");
        setBounds(400, 200, 600, 500);
        lamina = new JPanel();
        add(lamina);

        Action accionAmarillo = new AccionColor("Amarillo", new ImageIcon("graficos/Events/Amarillo.gif"),
                Color.YELLOW);
        Action accionAzul = new AccionColor("Azul", new ImageIcon("graficos/Events/Azul.gif"), Color.BLUE);
        Action accionRojo = new AccionColor("Rojo", new ImageIcon("graficos/Events/Rojo.gif"), Color.RED);

        Action accionSalir = new AbstractAction("Salir",new ImageIcon("graficos/Events/salir.gif")){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
            }
            
        };

        JMenu menu = new JMenu("Color");
        menu.add(accionAmarillo);
        menu.add(accionAzul);
        menu.add(accionRojo);

        JMenuBar barramenus = new JMenuBar();
        barramenus.add(menu);
        setJMenuBar(barramenus);
        JToolBar barra = new JToolBar();
        barra.add(accionAmarillo);
        barra.add(accionAzul);
        barra.add(accionRojo);
        barra.addSeparator();
        barra.add(accionSalir);
        add(barra, BorderLayout.NORTH);
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
            lamina.setBackground(c);
        }
    }
}
