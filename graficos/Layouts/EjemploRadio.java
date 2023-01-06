package graficos.Layouts;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;

public class EjemploRadio {
    public static void main(String[] args) {

        Marco_Radio miMarco = new Marco_Radio();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class Marco_Radio extends JFrame {
    public Marco_Radio() {
        setBounds(600, 300, 600, 350);
        Lamina_Radio miLamina = new Lamina_Radio();
        add(miLamina);

    }
}

class Lamina_Radio extends JPanel {
    private JLabel texto;
    JRadioButton boton1, boton2, boton3, boton4;

    public Lamina_Radio() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre....");
        add(texto, BorderLayout.CENTER);

        ButtonGroup miGrupo = new ButtonGroup();
        boton1 = new JRadioButton("Pequeño", false);
        boton2 = new JRadioButton("Mediano", true);
        boton3 = new JRadioButton("Grande", false);
        boton4 = new JRadioButton("Muy grande", false);

        boton1.addActionListener(new Evento_Radio());
        boton2.addActionListener(new Evento_Radio());
        boton3.addActionListener(new Evento_Radio());
        boton4.addActionListener(new Evento_Radio());

        JPanel laminaRadio = new JPanel();
        miGrupo.add(boton1);
        miGrupo.add(boton2);
        miGrupo.add(boton3);
        miGrupo.add(boton4);
        laminaRadio.add(boton1);
        laminaRadio.add(boton2);
        laminaRadio.add(boton3);
        laminaRadio.add(boton4);
        add(laminaRadio,BorderLayout.SOUTH);
    }

    private class Evento_Radio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            }else if(e.getSource() == boton2) {
                texto.setFont(new Font("Serif", Font.PLAIN, 12));
            }else if(e.getSource() == boton3) {
                texto.setFont(new Font("Serif", Font.PLAIN, 18));
            }else if(e.getSource() == boton4) {
                texto.setFont(new Font("Serif", Font.PLAIN, 24));
            }
        }
    }
}