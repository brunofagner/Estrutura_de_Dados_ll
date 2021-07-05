package parenteses;

public class Celula {
  private char parentese;
  private Celula anterior;

  public Celula(){}
 
  public Celula(char parentese, Celula anterior){
    this.parentese = parentese;
    this.anterior = anterior;
  }

  public char GetDado(){
    return this.parentese;
  }

  public void setDado(char parentese){
    this.parentese = parentese;
  }
  
  public Celula getAnterior(){
    return (this.anterior);
  }

  public void setAnterior(Celula anterior){
    this.anterior = anterior;
  }
}
