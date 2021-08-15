package fila_hospital;

public class No {
    int id;
    String sexo;
    int idade;
    boolean gestante;
    boolean lactante;
    boolean necessidadeEspecial;
    int prioridade =  0;
    No proximo;
    public No(){}
    public No(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = prioridade;
    }
}
