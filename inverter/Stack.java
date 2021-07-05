package inverter;

public class Stack {
  private Celula top;

  public void push(char letra){
    Celula novaCelula = new Celula();
    novaCelula.setDado(letra);
    novaCelula.setAnterior(this.top);
    this.top = novaCelula;
  }
  public void pop(){
    if(!isEmpyt()){
      System.out.print(this.top.GetDado());
      this.top = this.top.getAnterior();
    }else{
      System.out.println("Pilha vazia!!");
    }
  }
  public boolean isEmpyt(){
    if (this.top == null) {
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
      System.out.println("Nome no topo da pilha..: " +top.GetDado());
      return this.top;
    }
  }
  public void imprimir(){
    Celula p;
    p = this.top;
    if (isEmpyt()) {
      System.out.println("Pilha vazia!!!");
    }else{
      while (p != null) {
        System.out.print(p.GetDado()+ " ");
        p = p.getAnterior();
      }
    }
  }
}
