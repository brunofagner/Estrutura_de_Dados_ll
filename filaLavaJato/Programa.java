package filaLavaJato;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Fila sujos = new Fila();
    Fila lavados = new Fila();
    int option;
    do{
      System.out.println("<<=== Bem vindo a operação Lava Jato ===>>");
      System.out.println("1- Adicionar carro a fila");
      System.out.println("2- Imprimir carros lavados");
      System.out.println("3- Ordenar fila dos carros lavados");
      System.out.println("4- Finalizar");
      option = input.nextInt();

      if (option == 1) {
        System.out.println("Insira o numero de identificação: ");
        String nro = input.next();
        System.out.println("Insira o nome do dono: ");
        String nome = input.next();
        System.out.println("Insira a cor do carro: ");
        String cor = input.next();
        if (sujos.tamanho() == 3) {
          lavados.insere(sujos.remove());
          sujos.insere(new Carro(nro, nome, cor));
        }else{
          sujos.insere(new Carro(nro, nome, cor));
        }
      }else if (option == 2) {
        lavados.listar();
      }else if(option == 3){
        lavados.ordenar();
      }else{
        break;
      }
    }while(true);
    input.close();
  }

}