package imparPar;

public class Celula {
  private byte number;
  private Celula anterior;

  public Celula(){}
 
  public Celula(byte number, Celula anterior){
    this.number = number;
    this.anterior = anterior;
  }

  public byte GetDado(){
    return this.number;
  }

  public void setDado(byte number){
    this.number = number;
  }
  
  public Celula getAnterior(){
    return (this.anterior);
  }

  public void setAnterior(Celula anterior){
    this.anterior = anterior;
  }
}
