import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Date;
public class PruebaTemporizador {
    
    public static void main(String[] args) {
        DameLaHora oyente = new DameLaHora();
        Timer  miTemporizador = new Timer(5000,oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener","Hola", 1);
        System.exit(0);
    }
}

/**
* DameLaHora implements A
 */
class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 5 seg: " + ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}