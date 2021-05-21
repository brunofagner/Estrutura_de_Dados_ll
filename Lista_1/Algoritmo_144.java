import javax.swing.JOptionPane;
public class Algoritmo_144 {
  public static void main(String[] args) {
    double saldoMedio, credito;
    saldoMedio = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o saldo:"));
    if(saldoMedio < 501){
      credito = 0;
    }else if(saldoMedio < 1001){
      credito = saldoMedio * 0.3;
    }else if(saldoMedio < 3001){
      credito = saldoMedio * 0.4;
    }else{
      credito = saldoMedio * 0.5;
    }
    if(credito != 0){
      JOptionPane.showMessageDialog(null, "Como seu saldo era de "+saldoMedio+
      " seu credito sera de "+ credito);
    }else{
      JOptionPane.showMessageDialog(null, "Como seu saldo era de "+saldoMedio+
      " voce não tera nenhum credito");
    }
  }
}
