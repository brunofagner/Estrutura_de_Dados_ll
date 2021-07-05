package inverter;

public class Celula {
  private char letra;
  private Celula anterior;

  public Celula(){}
 
  public Celula(char letra, Celula anterior){
    this.letra = letra;
    this.anterior = anterior;
  }

  public char GetDado(){
    return this.letra;
  }

  public void setDado(char letra){
    this.letra = letra;
  }
  
  public Celula getAnterior(){
    return (this.anterior);
  }

  public void setAnterior(Celula anterior){
    this.anterior = anterior;
  }
}
