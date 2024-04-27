import  javax.swing.*;
import  java.awt.event.*;

public class Formulario2 extends JFrame implements  ActionListener {
    
    JButton button1;

    public Formulario2(){
        setLayout(null);
        button1 = new  JButton("Cerrar")
        button1.setBounds(300, 250, 100, 30);
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent  e){  // Esto es  para capturar  el evento
        if(e.getSource() == button1 ){ //metodo getSource recupera el evento del espacio de memoria

        }
    }
}
