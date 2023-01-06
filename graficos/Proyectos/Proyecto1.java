package graficos.Proyectos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.*;
import java.awt.event.*;

public class Proyecto1 {
    public static void main(String[] args) {
        FramePrincipal mimarco = new FramePrincipal();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }
}

class FramePrincipal extends JFrame {
    public FramePrincipal() {
        setBounds(400, 200, 500, 450);
        Lamina1 miLamina = new Lamina1();
        add(miLamina);

    }
}

class Lamina1 extends JPanel {

    // private JTextArea area;
    private JTextPane area; // mas potente ya que permite manipular cosas en su interior y poner sus barras
                            // desplazamiento
    private JMenu fuente, estilo, tamano;
    private JMenuBar mibarra;
    private Font letras;

    public Lamina1() {
        setLayout(new BorderLayout());

        mibarra = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamaño");

        itemMenu("Arial", fuente, "Arial", 9, 12);
        itemMenu("Courier", fuente, "Courier", 9, 12);
        itemMenu("Verdana", fuente, "Verdana", 9, 12 );

        itemMenu("Negrita", estilo, "", Font.BOLD, 12);
        itemMenu("Cursiva", estilo, "", Font.ITALIC, 12);

        itemMenu("12", tamano, "", 1, 12);
        itemMenu("16", tamano, "", 1, 16);
        itemMenu("20", tamano, "", 1, 20);
        itemMenu("24", tamano, "", 1, 24);

        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamano);

        JPanel laminamenu = new JPanel();
        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);

        area = new JTextPane();
        add(area, BorderLayout.CENTER);

    }

    private void itemMenu(String rotulo, JMenu menu, String tipoLetra, int estilos, int tam) {
        JMenuItem item = new JMenuItem(rotulo);
        menu.add(item);
        item.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tam));

    }

    private class GestionaEventos implements ActionListener {
        String tipoTexto, menuT;
        int estiloLetra, tamanioLetra;

        public GestionaEventos(String elemento, String texto2, int estilo2, int tamLetra) {
            tipoTexto = texto2;
            estiloLetra = estilo2;
            tamanioLetra = tamLetra;
            menuT = elemento;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            letras = area.getFont();
            if (menuT == "Arial" || menuT == "Courier" || menuT == "Verdana") {
                estiloLetra = letras.getStyle();
                tamanioLetra = letras.getSize();

            } else if (menuT == "Cursiva" || menuT == " Negrita") {
                if (letras.getStyle() == 1 || letras.getStyle() == 2) {
                    estiloLetra = 3;
                }
                tipoTexto = letras.getFontName();
                tamanioLetra = letras.getSize();

            } else if (menuT == "12" || menuT == " 16" || menuT == "20" || menuT == " 24") {
                tipoTexto = letras.getFontName();
                estiloLetra = letras.getStyle();
            }

            area.setFont(new Font(tipoTexto, estiloLetra, tamanioLetra));

            System.out.println(tipoTexto + " " + estiloLetra + " " + tamanioLetra);
        }
    }
}
