package imparPar;
import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    byte number;
    Scanner input = new Scanner(System.in);
    Stack par = new Stack();
    Stack impar = new Stack();

    do{
      System.out.println("Digite um numero entre -127 e 128 (0 para finalizar):");
      number = input.nextByte();
      if (number == 0) {
        break;
      }else if(number % 2 == 0){
        par.push(number);
      }else{
        impar.push(number);
      }
    }while(number != 0);

    while(true){
      if(!impar.isEmpyt())impar.pop();
      if(!par.isEmpyt())par.pop();
      else break;
    }
    
    if (!impar.isEmpyt()) {
      System.out.println("Faltaram "+ impar.sizePilha()+ " numero(s) impar(es), sendo ele(s):");
      while(!impar.isEmpyt()){
        impar.pop();
      }
    }else if (!par.isEmpyt()){
      System.out.println("Faltaram "+ par.sizePilha()+ " numer(os) par(es), sendo ele(s):");
      while(!par.isEmpyt()){
        par.pop();
      }
    }
    input.close();
  }
}
