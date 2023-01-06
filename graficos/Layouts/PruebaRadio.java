package graficos.Layouts;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class PruebaRadio {
    public static void main(String[] args) {

        MarcoRadio miMarco = new MarcoRadio();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoRadio extends JFrame {
    public MarcoRadio() {
        setBounds(600, 300, 600, 350);
        LaminaRadio miLamina = new LaminaRadio();
        add(miLamina);

    }
}

class LaminaRadio extends JPanel {

    public LaminaRadio() {
        ButtonGroup miGrupo1 = new ButtonGroup();
        JRadioButton boton1 = new JRadioButton("Azul",false);
        JRadioButton boton2 = new JRadioButton("Amarillo",true);
        JRadioButton boton3 = new JRadioButton("Rojo",false);

        ButtonGroup miGrupo2 = new ButtonGroup();
        JRadioButton boton4 = new JRadioButton("Masculino",false);
        JRadioButton boton5 = new JRadioButton("Femenino",false);

        miGrupo1.add(boton1);
        miGrupo1.add(boton2);
        miGrupo1.add(boton3);

        miGrupo2.add(boton4);
        miGrupo2.add(boton5);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
    }
}