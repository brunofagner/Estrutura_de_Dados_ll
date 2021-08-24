package AT_228;

public class No {
    String placa;
    int vezes = 0;
    No proximo;
    public No(){}
    public No(String placa){
        this.placa = placa;
    }
    public No(No carro){
        this.placa = carro.placa;
        this.vezes = carro.vezes;
    }
}
