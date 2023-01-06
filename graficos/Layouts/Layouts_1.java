package graficos.Layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class Layouts_1 {
    public static void main(String[] args) {
        Marco_Layout marco = new Marco_Layout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}

class Marco_Layout extends JFrame {
    public Marco_Layout() {
        setTitle("Prueba Acciones");
        setBounds(600, 350, 600, 300);
        Panel_Layout lamina = new Panel_Layout();
        // FlowLayout disposicion = new FlowLayout(FlowLayout.RIGHT);
        // lamina.setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
        add(lamina);
    }
}

class Panel_Layout extends JPanel {
    public Panel_Layout() {
        //setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
        setLayout(new BorderLayout(10,10));

        JButton Amarillo = new JButton("Amarillo");
        add(Amarillo,BorderLayout.NORTH);
        add(new JButton("Azul"),BorderLayout.SOUTH);
        add(new JButton("Rojo"),BorderLayout.EAST);
        add(new JButton("Verde"),BorderLayout.WEST);

        JPanel centroPlantilla = new JPanel();
        centroPlantilla.setLayout(new FlowLayout(FlowLayout.RIGHT,75,100));
        centroPlantilla.add(new JButton("Hola"));
        Centro_Color cambioColor = new Centro_Color(centroPlantilla);
        Amarillo.addActionListener(cambioColor);
        
        add(centroPlantilla,BorderLayout.CENTER);
    }
}

class Centro_Color implements ActionListener{
    JPanel cambio;
    public Centro_Color (JPanel frame){
        cambio = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cambio.setBackground(Color.YELLOW);
        
    }

}