package graficos;
import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {
    public static void main(String[] args) {
        MiMarco marco1 = new MiMarco();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}


class MiMarco extends JFrame{
    public MiMarco(){
        //setSize(500,300);
        //setLocation(500, 300);
        setBounds(500, 300, 350, 250);
        //setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setVisible(true);
        setTitle("Hola al proyecto");
        
    }
}

