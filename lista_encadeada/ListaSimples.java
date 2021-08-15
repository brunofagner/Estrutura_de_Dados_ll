package lista_encadeada;

import java.util.ArrayList;
import java.util.Random;

public class ListaSimples {
    No inicio = null;
    int tamanho = 0;

    public void inserirInicio(int nro, String nome, String telefone, String endereco, String cpf){
        No no = new No(nro, nome, telefone, endereco, cpf);
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public String retirarInicio(){
        if (inicio == null) {
            return null;
        }
        String dados = "Numero:"+ inicio.nro +", nome: "+inicio.nome +" retirado";
        inicio = inicio.proximo;
        tamanho--;
        return dados;
    }

    public void inserirFim(int nro, String nome, String telefone, String endereco, String cpf){
        No no = new No(nro, nome, telefone, endereco, cpf);
        if (inicio == null) {
            no.proximo = null;
            inicio = no;
        }else{
            No local = inicio;
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = no;
            no.proximo = null;
        }
        tamanho++;
    }

    public String retirarFim(){
        if (inicio == null) {
            return null;
        }
        No local = inicio;
        while (local.proximo != null){
            No aux = local;
            local = local.proximo;
            if (local.proximo == null) {
                aux.proximo = null;
                tamanho--;
                return "Numero:"+ local.nro +", nome: "+local.nome +" retirado";
            }
        }
        inicio = null;
        tamanho--;
        return null;
    }

    public void inserirIndice(int indice, int nro, String nome, String telefone, String endereco, String cpf){
        if (indice <= 0) {
            inserirInicio(nro, nome, telefone, endereco, cpf);
        }else if(indice >= tamanho){
            inserirFim(nro, nome, telefone, endereco, cpf);
        }else{
            No local = inicio;
            for (int i = 0; i < indice - 1; i++) {
                local = local.proximo;
            }
            No no  = new No(nro, nome, telefone, endereco, cpf);
            no.proximo = local.proximo;
            local.proximo = no;
            tamanho++;
        }
    }

    public String retirarIndice(int indice){
        if (indice < 0 || indice >= tamanho || inicio == null){
            return null;
        }else if (indice == 0) {
            return retirarInicio();
        }else if(indice == tamanho -1){
            return retirarFim();
        }
        No local = inicio;
        for (int i = 0; i < indice-1; i++) {
            local = local.proximo;
        }
        String info = "Numero:"+ local.proximo.nro +", nome: "+local.proximo.nome +" retirado";
        local.proximo = local.proximo.proximo;
        tamanho--;
        return info;
    }
    public String toString(){
        String str = "";
        No local  = inicio;
        while (local != null) {
            str += local.nro+ ": "+ local.nome +", cpf: "+local.cpf+", endereço: "+ local.endereco+ "\n";
            local = local.proximo; 
        }
        return str;
    }
    public static void main(String [] args){
        ListaSimples roda = new ListaSimples();
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Joelma");
        nomes.add("Jasinto");
        nomes.add("Naosinto");
        nomes.add("Aindasinto");
        nomes.add("josefa");
        nomes.add("Creusa");
        ArrayList<String> enderecos = new ArrayList<String>();
        enderecos.add("Rua das valquirias");
        enderecos.add("Rua das amoebas");
        enderecos.add("Avenida da cruz angelical");
        enderecos.add("Rua das flores mortas");
        ArrayList<String> cpfs = new ArrayList<String>();
        cpfs.add("093.312.543-30");
        cpfs.add("421.345.983-19");
        cpfs.add("321.958.938-12");
        cpfs.add("431.031.321-23");
        ArrayList<String> telefones = new ArrayList<>();
        telefones.add("992233123");
        telefones.add("413244321");
        telefones.add("983133237");
        telefones.add("973212345");
        telefones.add("937183736");
        Random gerador = new Random();
        for (int i = 1; i <= 20; i++) {
            int num = gerador.nextInt(6);
            String nome = nomes.get(num);
            num = gerador.nextInt(3);
            String telefone = telefones.get(num);
            num = gerador.nextInt(4);
            String endereco = enderecos.get(num);
            num = gerador.nextInt(4);
            String cpf = cpfs.get(num);
            roda.inserirInicio(i, nome, telefone, endereco, cpf);
        }
        System.out.println(roda);
        for (int i = 0; i < 19; i++) {
           int num = gerador.nextInt(roda.tamanho);
           roda.retirarIndice(num);
        }
        
        System.out.println(roda.inicio.nro +": "+ roda.inicio.nome);
    }
}
