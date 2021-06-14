package Lista_2;
import javax.swing.JOptionPane;
public class Algoritmo_356 {
  public static void main(String[] args) {
    int t;
    String nomes[] = new String[15], situacao[] = new String[15];
    float pr1[] = new float[15], pr2[] = new float[15], media[] = new float[15];

    //Com for
    for (int i = 0; i <= 14; i++) {
      nomes[i] = JOptionPane.showInputDialog(null, "Digite o "+ (i+1) + " nome: ");
      if(nomes[i].length()>30){
        JOptionPane.showMessageDialog(null, "Nomes com até 30 caracteres!");
        i--;
        continue;
      }

      t = 30-nomes[i].length();
      for (int j = 0; j < t; j++) {
        nomes[i] += " ";
      }

      pr1[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a n1: "));
      pr2[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a n1: "));
      media[i] = (pr1[i] + pr2[i])/2;
      if(media[i]>= 5){
        situacao[i] = "AP";
      }else{
        situacao[i] = "RP";
      }
    }
    for (int i = 0; i <= 14; i++) {
      JOptionPane.showMessageDialog(null, (i+1)+ " - "+ nomes[i] + " " + pr1[i] +
      " " + pr2[i] + " " + media[i] + " " + situacao[i]);

    }

    //Com while
    int i = 0, h = 0;
    while(i <= 14) {
      nomes[i] = JOptionPane.showInputDialog(null, "Digite o "+ (i+1) + " nome: ");
      if(nomes[i].length()>30){
        JOptionPane.showMessageDialog(null, "Nomes com até 30 caracteres!");
        i--;
        continue;
      }

      t = 30-nomes[i].length();
      while (h < t) {
        nomes[i] += " ";
      }
      h = 0;
      pr1[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a n1: "));
      pr2[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a n1: "));
      media[i] = (pr1[i] + pr2[i])/2;
      if(media[i]>= 5){
        situacao[i] = "AP";
      }else{
        situacao[i] = "RP";
      }
      i++;
    }

    int j = 0;
    while (j <= 14) {
      JOptionPane.showMessageDialog(null, (j+1)+ " - "+ nomes[j] + " " + pr1[j] +
      " " + pr2[j] + " " + media[j] + " " + situacao[j]);
      j++;
    }

    //Com do while
    i = 0; h = 0;
    do {
      nomes[i] = JOptionPane.showInputDialog(null, "Digite o "+ (i+1) + " nome: ");
      if(nomes[i].length()>30){
        JOptionPane.showMessageDialog(null, "Nomes com até 30 caracteres!");
        i--;
        continue;
      }

      t = 30-nomes[i].length();
      do {
        nomes[i] += " ";
      }while (h < t);
      h = 0;
      pr1[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a n1: "));
      pr2[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a n1: "));
      media[i] = (pr1[i] + pr2[i])/2;
      if(media[i]>= 5){
        situacao[i] = "AP";
      }else{
        situacao[i] = "RP";
      }
      i++;
    }while(i <= 14);

    j = 0;
    do {
      JOptionPane.showMessageDialog(null, (j+1)+ " - "+ nomes[j] + " " + pr1[j] +
      " " + pr2[j] + " " + media[j] + " " + situacao[j]);
      j++;
    }while (j <= 14);

   
  }
}
