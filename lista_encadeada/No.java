package lista_encadeada;

public class No {
    int nro;
    String nome;
    String telefone;
    String endereco;
    String cpf;
    No proximo;
    public No(){}
    public No(int nro, String nome, String telefone, String endereco, String cpf){
        this.nro = nro;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }
}
