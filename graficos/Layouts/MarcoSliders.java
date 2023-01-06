package graficos.Layouts;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders {
    public static void main(String[] args) {
        Frame_Slider miMarco = new Frame_Slider();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class Frame_Slider extends JFrame {
    public Frame_Slider() {
        setBounds(550, 400, 550, 350);
        Lamina_Sliders miLamina = new Lamina_Sliders();
        add(miLamina);

    }
}

class Lamina_Sliders extends JPanel {
    private JSlider control;
    private JLabel rotulo;

    public Lamina_Sliders() {
        setLayout(new BorderLayout());
        rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre....");
        add(rotulo, BorderLayout.CENTER);

        control = new JSlider(8, 50,12);// SwingConstants.VERTICAL,
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        control.setPaintLabels(true);
        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control);
        control.addChangeListener(new Evento_Slider());
        add(laminaSlider, BorderLayout.NORTH);

        
    }

    private class Evento_Slider implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            rotulo.setFont(new Font("Serif", Font.ITALIC, control.getValue() ));
            
        }

    }
}