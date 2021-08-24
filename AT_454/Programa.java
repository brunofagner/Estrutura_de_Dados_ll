package AT_454;

import java.util.LinkedList;
import java.util.Scanner;

public class Programa {
    String nome;
    int numero;
    public Programa(){}
    public Programa(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }
    @Override
    public String toString() {
        return nome;
    }
    public static void main(String[] args) {
        LinkedList<Object> roda = new LinkedList<Object>(); 
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas pessoas estara no circulo?");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o nome: ");
            String nome = input.next();
            System.out.println("Entre com o numero");
            int numero = input.nextInt();
            roda.addLast(new Programa(nome, numero));
        }
        System.out.println("Entre com o numero inicial:");
        int num = input.nextInt();
        Programa removido = (Programa) roda.remove(num-1);
        System.out.println("Removido: "+ removido);
        for (int i = 0; i < n-2; i++) {
            num = removido.numero;
            while (num > roda.size()) {
                num -= roda.size();
            }
            removido = (Programa) roda.remove(num-1);
            System.out.println("Removido: "+ removido.nome);
            num = removido.numero;
        }
        System.out.println("O sobrevivente foi: "+ roda.get(0).toString());
    }
}
