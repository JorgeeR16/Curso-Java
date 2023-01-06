package graficos;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;

public class CreandoMarcoCentrado {
    public static void main(String[] args) {
        MarcoCentrado pantalla = new MarcoCentrado();
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCentrado extends JFrame {

    public MarcoCentrado() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamañoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamañoPantalla.width;
        int anchoPantalla = tamañoPantalla.height;
        setSize(alturaPantalla / 2, anchoPantalla / 2);
        setLocation(alturaPantalla / 4, anchoPantalla / 4);
        setTitle("Marco centrado");
        Image miIcono = miPantalla.getImage(getClass().getResource("icono.gif"));
        //Image miIcono2 = miPantalla.getImage("D:\\Cursos\\Java\\graficos\\icono.gif");
        setIconImage(miIcono);
        setVisible(true);
    }
}
