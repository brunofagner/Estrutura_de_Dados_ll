package imparPar;

public class Stack {
  private Celula top;

  public void push(byte parentese){
    Celula novaCelula = new Celula();
    novaCelula.setDado(parentese);
    novaCelula.setAnterior(this.top);
    this.top = novaCelula;
  }
  public void pop(){
    if(!isEmpyt()){
      System.out.println(this.top.GetDado());
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
  public int sizePilha(){
    Celula p;
    p = this.top;
    int cont = 0;
    
    while(p!= null){
      p = p.getAnterior();
      cont++;
    }
    return cont;
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
