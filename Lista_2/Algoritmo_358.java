package Lista_2;
import javax.swing.JOptionPane;

public class Algoritmo_358 {
  public static void main(String[] args) {
    double precoCompra[] = new double[10], precoVenda[] = new double[10], lucro;
    int menor10 = 0, menor20 = 0, maior20 = 0;
    for (int i = 0; i < precoVenda.length; i++) {
      precoCompra[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço de venda"));
      precoCompra[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço de compra"));
      lucro = precoVenda[i] - precoCompra[i];

      if(lucro < 10.0){menor10++;}
      else if(lucro <= 20.0){menor20++;}
      else{maior20++;}
    }
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com lucro < 10%: "+ menor10);
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com 10% <= lucro <= 20%: "+ menor20);
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com lucro > 20%: "+ maior20);

    //com while
    menor10 = 0; menor20 = 0; maior20 = 0; 
    int i = 0;
    while (i < precoVenda.length) {
      precoCompra[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço de venda"));
      precoCompra[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço de compra"));
      lucro = precoVenda[i] - precoCompra[i];

      if(lucro < 10.0){menor10++;}
      else if(lucro <= 20.0){menor20++;}
      else{maior20++;}
      i++;
    }
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com lucro < 10%: "+ menor10);
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com 10% <= lucro <= 20%: "+ menor20);
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com lucro > 20%: "+ maior20);
    
    //com while
    menor10 = 0; menor20 = 0; maior20 = 0; 
    i = 0;
    do {
      precoCompra[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço de venda"));
      precoCompra[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço de compra"));
      lucro = precoVenda[i] - precoCompra[i];

      if(lucro < 10.0){menor10++;}
      else if(lucro <= 20.0){menor20++;}
      else{maior20++;}
      i++;
    }while (i < precoVenda.length);
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com lucro < 10%: "+ menor10);
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com 10% <= lucro <= 20%: "+ menor20);
    JOptionPane.showMessageDialog(null, "Total de mercadoriaas com lucro > 20%: "+ maior20);
  
  }
}
