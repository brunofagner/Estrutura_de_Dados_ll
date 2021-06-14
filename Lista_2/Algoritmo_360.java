package Lista_2;
import javax.swing.JOptionPane;

public class Algoritmo_360 {
  public static void main(String[] args) {
    int ultdia[] = new int[12], data, dia, mes;
    String signo[] = new String[12];
    for (int i = 0; i < 12; i++) {
    signo[i] = JOptionPane.showInputDialog(null, "Insira o signo:");
    signo[i] = JOptionPane.showInputDialog(null, "Insira o ultimo dia:");

    }
    data = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data (ddmm)"+
    " ou 9999 para finalizar"));
    for (int i = 0; i == 9999; i++) {
      dia = (int) data/100;
      mes = data % 100;
      mes--;
      if(dia > ultdia[mes]){
        mes = (mes-1) % 12;
      }
      JOptionPane.showMessageDialog(null, "Signo: " + signo[mes]);
      data = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data (ddmm)"+
      " ou 9999 para finalizar"));
    }
  
  }
}
