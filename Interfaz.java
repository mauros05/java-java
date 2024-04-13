import javax.swing.*;

public class Interfaz extends JFrame {
    public Interfaz(){  //  <--constructor
        setLayout(null);
    }

    public static void main(String[]  args){
        Interfaz formulario1 = new Interfaz();
        formulario1.setBounds(0, 0, 800, 550);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false); //  el usuario no podra modificar el tamano el archivo Java
    }
}
