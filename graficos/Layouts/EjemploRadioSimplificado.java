package graficos.Layouts;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;

public class EjemploRadioSimplificado {
    public static void main(String[] args) {

        Marco_Radio1 miMarco = new Marco_Radio1();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class Marco_Radio1 extends JFrame {
    public Marco_Radio1() {
        setBounds(600, 300, 600, 350);
        Lamina_Radio1 miLamina = new Lamina_Radio1();
        add(miLamina);

    }
}

class Lamina_Radio1 extends JPanel {
    private JLabel texto;
    private ButtonGroup miGrupo;
    private JPanel lamina_botones;

    public Lamina_Radio1() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre....");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);
        lamina_botones = new JPanel();
        miGrupo = new ButtonGroup();
        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy Grande", false, 24);

        add(lamina_botones,BorderLayout.SOUTH);

    }

    public void colocarBotones(String nombre, boolean b, final int i) {
        JRadioButton boton = new JRadioButton(nombre, b);
        miGrupo.add(boton);
        lamina_botones.add(boton);

        ActionListener mievento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, i));
            }
        };
        boton.addActionListener(mievento);
    }
}