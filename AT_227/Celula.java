package AT_227;

public class Celula {
  private int numero;
  private int anterior;

  public Celula(){}
 
  public Celula(int numero, int anterior){
    this.numero = numero;
    this.anterior = anterior;
  }

  public int GetDado(){
    return this.numero;
  }

  public void setDado(int numero){
    this.numero = numero;
  }
  
  public int getAnterior(){
    return (this.anterior);
  }

  public void setAnterior(int anterior){
    this.anterior = anterior;
  }
}
