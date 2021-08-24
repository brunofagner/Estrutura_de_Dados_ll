package AT_227;

import java.util.Random;

public class Stack {
  private int top = 0;
  private int top2 = 999;
  Celula vetor[] =  new Celula[1000];

  public void push(int numero){
    if (top == top2) {
      System.out.println("Vetor cheio");
    }else{
      vetor[top] = new Celula(numero, this.top);
      this.top++;
    }
  }
  public void push2(int numero){
    if (top2 == top) {
      System.out.println("Vetor cheio");
    }else{
      vetor[top2] = new Celula(numero, this.top2);
      this.top2--;
    }
  }
  public void pop(){
    if(!isEmpyt()){
      this.top = this.vetor[top].getAnterior();
      this.vetor[top] = new Celula(0,0);
      top--;
    }else{
      System.out.println("Pilha vazia!!");
    }
  }
  public void pop2(){
    if(!isEmpyt2()){
      this.top2 = this.vetor[top2].getAnterior();
      this.vetor[top2] = new Celula(0,0);
      top2--;
    }else{
      System.out.println("Pilha vazia!!");
    }
  }
  public boolean isEmpyt(){
    if (this.top == 0) {
      return true;
    }else{
      return false;
    }
  }
  public boolean isEmpyt2(){
    if (this.top2 == 999) {
      return true;
    }else{
      return false;
    }
  }

  public Celula top(){
    if (isEmpyt()) {
      System.out.println("Pilha vazia!!");
      return null;
    }else{
      System.out.println("Nome no topo da pilha..: " +vetor[top].GetDado());
      return this.vetor[top];
    }
  }
  public Celula top2(){
    if (isEmpyt()) {
      System.out.println("Pilha vazia!!");
      return null;
    }else{
      System.out.println("Nome no topo da pilha..: " +vetor[top2].GetDado());
      return this.vetor[top2];
    }
  }

  public void imprimir(){
    int t = this.top;
    if (isEmpyt()) {
      System.out.println("Pilha vazia!!!");
    }else{
      while (t >= 0) {
        System.out.print(vetor[t].GetDado()+ " ");
        t--;
      }
    }
  }
  public void imprimir2(){
    int t = this.top2;
    if (isEmpyt()) {
      System.out.println("Pilha vazia!!!");
    }else{
      while (t != 999) {
        System.out.print(vetor[t].GetDado()+ " ");
        t--;
      }
    }
  }

  public static void main(String[] args) {
    Stack pilha = new Stack();
    Random num = new Random();

    for (int i = 0; i < 590; i++) {
      pilha.push(num.nextInt());
    }
    for (int i = 0; i < 420; i++) {
      pilha.push2(num.nextInt());
    }
    for (int i = 0; i < pilha.top; i++) {
      System.out.println("("+i+")"+pilha.vetor[i].GetDado());
    }
    for (int i = 999; i > pilha.top2; i--) {
      System.out.println("("+i+")"+pilha.vetor[i].GetDado());
    }
  }
}
