import javax.swing.JOptionPane;
public class Algoritmo_84{
  public static void main(String[] args) {
    //Com IF
    int number = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
    if(number % 2 == 0){
      JOptionPane.showMessageDialog(null,"Par");
    }else{
      JOptionPane.showMessageDialog(null,"Impar");
    }

    //Com switch
    number = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
    number %= 2;
    switch (number){
      case 0:
        JOptionPane.showMessageDialog(null, "Par");
        break;
      default:
        JOptionPane.showMessageDialog(null, "Impar");
    }
  }
}