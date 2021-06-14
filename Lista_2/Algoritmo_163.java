package Lista_2;

public class Algoritmo_163 {
  public static void main(String[] args) {
    //usando for
    for (int voltas = 1; voltas < 3; voltas++) {
      System.out.println(voltas +" voltas na lagoa");
      for (int abdominais = 1; abdominais < 5; abdominais++){
        System.out.println(abdominais + " abdominais");
      }
    }
    //usando while
    int voltas = 1, abdominais = 1;
    
    while (voltas < 3) {
      System.out.println(voltas +" voltas na lagoa");
      voltas++;
      while (abdominais < 5){
        System.out.println(abdominais + " abdominais");
        abdominais++;
      }
      abdominais = 1;
    }
    //usando do while
    voltas = 1;
    abdominais = 1;
    do{
      System.out.println(voltas +" voltas na lagoa");
      voltas++;
      do{
        System.out.println(abdominais + " abdominais");
        abdominais++;
      }while (abdominais < 5);
      abdominais = 1;
    }while (voltas < 3) ;
 }
}
