package Lista_2;
import java.util.Scanner;
public class Algoritmo_161 {
  public static void main(String[] args) {
    double number; 
    Scanner scan = new Scanner(System.in);
    //Com for
    for(int i = 0; i < 5; i++){
      System.out.println("Insira um numero: ");
      number = scan.nextDouble();
      System.out.println("O quadrado do numero é: "+ Math.pow(number, 2));
    }
    //Com while
    int i = 0;
    while(i < 5){
      System.out.println("Insira um numero: ");
      number = scan.nextDouble();
      System.out.println("O quadrado do numero é: "+ Math.pow(number, 2));
      i++;
    }
    //Com do while
    i = 0;
    do{
      System.out.println("Insira um numero: ");
      number = scan.nextDouble();
      System.out.println("O quadrado do numero é: "+ Math.pow(number, 2));
      i++;
    }while(i < 5);
    scan.close();
  }
}
