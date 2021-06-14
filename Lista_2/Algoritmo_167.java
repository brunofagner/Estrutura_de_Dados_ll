package Lista_2;

public class Algoritmo_167 {
  public static void main(String[] args) {
    //com for
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i ; j++) {
        System.out.print("    ");
      }
      for (int h = i+1; h <= 10; h++) {
        System.out.print(""+i+"-"+h+" ");
      } 
      System.out.println("");
    }

    //Com while
    int i = 1, j = 1, h;
    while(i <= 9){
      while(j <= i){
        System.out.print("    ");
        j++;
      }
      j = 1;
      h = i+1;
      while(h <= 10){
        System.out.print(""+i+"-"+h+" ");
        h++;
      }
      System.out.println("");
      i++;
    }

    //Com do while
    i = 1; j = 1;
    do{
      do{
        System.out.print("    ");
        j++;
      }while(j <= i);
      j = 1;
      h = i+1;
      do{
        System.out.print(""+i+"-"+h+" ");
        h++;
      }while(h <= 10);
      System.out.println("");
      i++;
    }while(i <= 9);
    
  }
}
