import javax.swing.JOptionPane;
public class Algoritmo_60 {
  public static void main(String[] args) {
    int dec, razao, termo;
    termo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o termo"));
    razao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a razão"));
    dec = termo + 9 * razao;
    JOptionPane.showMessageDialog(null,"O 10 termo desta P.A. e: "+ dec);
  }
}
