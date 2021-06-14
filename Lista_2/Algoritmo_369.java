package Lista_2;
import javax.swing.JOptionPane;

public class Algoritmo_369 {
  public static void main(String[] args) {
    int mesa[] = new int[30], qtde[] = new int[30], lugares, codigo, lugMesa;
    for (int i = 0; i < 30; i++) {
      mesa[i] = 100 + i;
      qtde[i] = 5;
    }    
    lugares = 150;
    codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com codigo"+
    " (100 - 129) ou O para terminar:"));
    while(codigo > 0 && lugares != 0){
      int i = 0;
      while (codigo != mesa[i] && i < 29) {i++;}
        if (codigo == mesa[i]) {
          lugMesa = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade "
          +"de lugares a reservar: "));
          if (qtde[i] >= lugMesa) {
            qtde[i] -= lugMesa;
            lugares -= lugMesa;
          }else{
            JOptionPane.showMessageDialog(null, "Não há lugares para reservar!");
          }
        }else{
        JOptionPane.showMessageDialog(null, "Codigo e mesa invalido!");
      }
      codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com codigo"+
      " (100 - 129) ou O para terminar:"));
    }
    if(lugares == 0){
      JOptionPane.showMessageDialog(null, "Lotação esgotada!");
    }else{
      JOptionPane.showMessageDialog(null, "Lugares vagos:");
      for (int i = 0; i < qtde.length; i++) {
        if (qtde[i] != 0) {
          JOptionPane.showMessageDialog(null, "mesa: " + mesa[i] + " total de lu"
          +"gares: "+ qtde[i]);
        }
      }
    }
    //Com do while
    do{
      int i = 0;
      do {i++;}while (codigo != mesa[i] && i < 29);
        if (codigo == mesa[i]) {
          lugMesa = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade "
          +"de lugares a reservar: "));
          if (qtde[i] >= lugMesa) {
            qtde[i] -= lugMesa;
            lugares -= lugMesa;
          }else{
            JOptionPane.showMessageDialog(null, "Não há lugares para reservar!");
          }
        }else{
        JOptionPane.showMessageDialog(null, "Codigo e mesa invalido!");
      }
      codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com codigo"+
      " (100 - 129) ou O para terminar:"));
    }while(codigo > 0 && lugares != 0);
    if(lugares == 0){
      JOptionPane.showMessageDialog(null, "Lotação esgotada!");
    }else{
      JOptionPane.showMessageDialog(null, "Lugares vagos:");
      for (int i = 0; i < qtde.length; i++) {
        if (qtde[i] != 0) {
          JOptionPane.showMessageDialog(null, "mesa: " + mesa[i] + " total de lu"
          +"gares: "+ qtde[i]);
        }
      }
    }
  }
}
