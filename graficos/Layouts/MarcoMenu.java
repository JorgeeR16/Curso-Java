package graficos.Layouts;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MarcoMenu {
    public static void main(String[] args) {
        MenuFrame miMarco = new MenuFrame();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MenuFrame extends JFrame {
    public MenuFrame() {
        setBounds(550, 400, 550, 350);
        MenuLamina miLamina = new MenuLamina();
        add(miLamina);

    }
}

class MenuLamina extends JPanel {

    public MenuLamina() {
        setLayout(new BorderLayout());
        JMenuBar mibarra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarcomo = new JMenuItem("Guardar como");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");

        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        JMenuItem opcion2 = new JMenuItem("Opcion 2");

        archivo.add(guardar);
        archivo.add(guardarcomo);

        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);
        edicion.addSeparator();
        opciones.add(opcion1);
        opciones.add(opcion2);
        edicion.add(opciones);

        herramientas.add(generales);

        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(herramientas);

        add(mibarra, BorderLayout.NORTH);

    }
}