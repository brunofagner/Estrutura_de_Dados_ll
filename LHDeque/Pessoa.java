package LHDeque;

public class Pessoa {
    int id;
    String sexo;
    int idade;
    boolean gestante;
    boolean lactante;
    boolean necessidadeEspecial;
    int prioridade =  0;
    public Pessoa(){}
    public Pessoa(int prioridade, int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial){
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = prioridade;
    }
    public String toString() {
        return "\nID: "+ this.id +"\n Prioridade: "+ this.prioridade;
    }
}
