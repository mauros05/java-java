import javax.swing.*; // <-- libreria

public class Swing extends JFrame {
  private JLabel label1; // <-- Los labels deben de ser privados
    
  public Swing(){ // <-- constructor
    setLayout(null); // <-- Indica mediante coordenadas donde vamos a colocar la interfaz
    label1 = new JLabel("Mi primera interfaz");
    label1.setBounds(10, 20, 200, 300);
    add(label1);
  }

   public static void main(String[] args){
    Swing swing1 = new Swing();
    swing1.setBounds(0,0,400,300);
    swing1.setVisible(true); // <-- para que tu interfaz se vea
    swing1.setLocationRelativeTo(null);// Cuando la interfaz se ejecute aparezca en el centro de mi pantalla
   }
}
