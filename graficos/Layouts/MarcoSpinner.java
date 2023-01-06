package graficos.Layouts;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class MarcoSpinner {
    public static void main(String[] args) {
        Frame_Spinner miMarco = new Frame_Spinner();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class Frame_Spinner extends JFrame {
    public Frame_Spinner() {
        setBounds(550, 400, 550, 350);
        add(new Lamina_Spiners());

    }
}

class Lamina_Spiners extends JPanel {

    public Lamina_Spiners() {
        // String lista[] =
        // GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {//clases internas anonimas
            public Object getNextValue() {
                return super.getPreviousValue();
            }

            public Object getPreviousValue() {
                return super.getNextValue();
            }
        });
        Dimension d = new Dimension(200, 20);
        control.setPreferredSize(d);
        add(control);
    }

    // private class MiModeloSpinner extends SpinnerNumberModel{
    // public MiModeloSpinner(){
    // super(5,0,10,1);
    // }
    // public Object getNextValue(){
    // return super.getPreviousValue();
    // }
    // public Object getPreviousValue(){
    // return super.getNextValue();
    // }

    // }

}