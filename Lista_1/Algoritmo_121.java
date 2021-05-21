import javax.swing.JOptionPane;
public class Algoritmo_121{
  public static void main(String[] args) {
    int n1, n2, n3, n4, n5, maior, menor;
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 numero:"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2 numero:"));
    n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 3 numero:"));
    n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite 4 numero:"));
    n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite 5 numero:"));
    if(n1!=n2 && n1!=n3 && n1!=n4 && n1!=n5 && n2!=n3 && n2!=n4 && n2!=n5 && 
    n3!=n4 && n3!=n5 && n4!=n5){
      if(n1 > n2){
        maior = n1;
        menor = n2;
      }else{
        maior = n2;
        menor = n1;
      }
      if(n3 > maior){
        maior = n3;
      }else{
        if(n3< menor){
          menor = n3;
        }
      }
      if(n4 > maior){
        maior = n4;
      }else{
        if(n4< menor){
          menor = n4;
        }
      }
      if(n5 > maior){
        maior = n5;
      }else{
        if(n5 < menor){
          menor = n5;
        }
      }
      JOptionPane.showMessageDialog(null, "Maior = "+maior);
      JOptionPane.showMessageDialog(null, "Menor = "+menor);
    }else{
      JOptionPane.showMessageDialog(null, "Os numeros devem ser diferentes!!");
    }
  }
}
