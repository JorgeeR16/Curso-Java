package graficos.Layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class Calculadora {
    public static void main(String[] args) {
        MarcoCalculadora miMarco = new MarcoCalculadora();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }
}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora() {
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        LaminaCalculadora miLamina = new LaminaCalculadora();
        add(miLamina);
        // pack();
    }
}

class LaminaCalculadora extends JPanel {
    private JPanel miLamina2;
    private JButton pantalla;
    private Boolean principio;
    private double resultado;
    private String ultimaOperacion;


    public LaminaCalculadora() {
        principio = true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        miLamina2 = new JPanel();
        miLamina2.setLayout(new GridLayout(4, 4));
        ponerBoton("7", new InsertarNumero());
        ponerBoton("8", new InsertarNumero());
        ponerBoton("9", new InsertarNumero());
        ponerBoton("/", new AccionOrden());
        ponerBoton("4", new InsertarNumero());
        ponerBoton("5", new InsertarNumero());
        ponerBoton("6", new InsertarNumero());
        ponerBoton("*", new AccionOrden());
        ponerBoton("1", new InsertarNumero());
        ponerBoton("2", new InsertarNumero());
        ponerBoton("3", new InsertarNumero());
        ponerBoton("-", new AccionOrden());
        ponerBoton("0", new InsertarNumero());
        ponerBoton(".", new InsertarNumero());
        ponerBoton("=", new AccionOrden());
        ponerBoton("+", new AccionOrden());
        add(miLamina2, BorderLayout.CENTER);
        ultimaOperacion = "=";

    }

    private void ponerBoton(String rotulo, ActionListener oyente) {
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        miLamina2.add(boton);
    }

    private class InsertarNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String numero = e.getActionCommand();
            if (principio) {
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + numero);

        }
    }

    private class AccionOrden implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
            Calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principio = true;
        }

        public void Calcular(double x){
            if (ultimaOperacion.equals("+")) {
                resultado += x;
                System.out.println(resultado);
            }
            else if(ultimaOperacion.equals("-")){
                resultado -= x;
            }
            else if(ultimaOperacion.equals("*")){
                resultado *= x;
            }
            else if(ultimaOperacion.equals("/")){
                resultado /= x;
            }
            else if(ultimaOperacion.equals("=")){
                resultado = x;
            }
            pantalla.setText(""+resultado);
        }
    }
}