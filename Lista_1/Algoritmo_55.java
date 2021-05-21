import javax.swing.JOptionPane;
public class Algoritmo_55 {
 public static void main(String[] args) {
   float biggerDiag, lessDiag, area;
   biggerDiag = Float.parseFloat(JOptionPane.showInputDialog("Entre com a diagonal maior:"));
   lessDiag = Float.parseFloat(JOptionPane.showInputDialog("Entre com a diagonal menor:"));
   area = (biggerDiag * lessDiag)/2;
   JOptionPane.showMessageDialog(null, "Area = "+ area);
 } 
}
