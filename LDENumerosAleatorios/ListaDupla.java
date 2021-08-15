package LDENumerosAleatorios;

import java.util.Arrays; 
import java.util.Random;

public class ListaDupla {
    Celula primeira;
    Celula ultima;
    int totalElementos = 0;

    boolean PosicaoOcupada(int pos){
        return (pos >= 0) && (pos < this.totalElementos);
    }

    Celula pegaCelula(int pos){
        if (!this.PosicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posição inexistente");
        }else{
            Celula atual = this.primeira;
            for (int i = 0; i < pos; i++) {
                atual = atual.getProxima();
            }
            return atual;
        }
    }

    Object Pega(int pos){
        return this.pegaCelula(pos).getElemento();
    }

    void AdicionarComeco(Object elemento){
        if (this.totalElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        }else{
            Celula nova =  new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalElementos++;
    }

    void Adiciona(Object elemento){
        if (this.totalElementos == 0) {
            this.AdicionarComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalElementos++;
        }
    }
    void Adiciona(int pos, Object elemento){
        if (pos == 0) {
            AdicionarComeco(elemento);
        }else if(pos == totalElementos){
            this.Adiciona(elemento);
        }else{
            Celula anterior = this.pegaCelula(pos-1);
            Celula proxima =  anterior.getProxima();
            Celula nova = new Celula(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totalElementos++;
        }
    }

    void RemoveComeco(){
        if (!PosicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição inexistente!");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalElementos--;
        }
        if (this.totalElementos == 0) {
            this.ultima = null;
        }
    }

    void RemoveFim(){
        if (!PosicaoOcupada(totalElementos-1)) {
            throw new IllegalArgumentException("Posição inexistente");
        }else{
            if (this.totalElementos == 1) {
                this.RemoveComeco();
            }else{
                Celula penultima = this.ultima.getAnterior();
                penultima.setProxima(null);
                this.ultima = penultima;
                this.totalElementos--;
            }
        }
    }

    void Remove(int pos){
        if (!this.PosicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posição inexistente");
        }else{
            if (pos == 0) {
                this.RemoveComeco();
            }else if(pos == totalElementos-1){
                this.RemoveFim();
            }else{
                Celula anterior = this.pegaCelula(pos - 1);
                Celula atual = anterior.getProxima();
                Celula proxima = atual.getProxima();
                anterior.setProxima(proxima);
                proxima.setAnterior(anterior);
                this.totalElementos--;
            }
        }
    }

    boolean Contem(Object elemento){
        Celula atual = this.primeira;
        while (atual != null) {
           if (atual.getElemento().equals(elemento)) {
               return true;
           }
           atual = atual.getProxima(); 
        }
        return false;
    }

    int Tamanho(){
        return this.totalElementos;
    }

    void EsvaziaLista(){
        this.primeira = null;
        this.ultima = null;
        this.totalElementos = 0;
    }

    String Imprimir(){
        if (this.totalElementos == 0) {
            return "[]";
        }else{
            StringBuilder builder = new StringBuilder("[");
            Celula atual = this.primeira;
            for (int i = 0; i < this.totalElementos - 1; i++) {
                builder.append(atual.getElemento());
                builder.append(", ");
                atual = atual.getProxima();
            }
            builder.append(atual.getElemento());
            builder.append("]");
            return builder.toString();
        }
    }
    String ImprimirContrario(){
        if (this.totalElementos == 0) {
            return "[]";
        }else{
            StringBuilder builder = new StringBuilder("[");
            Celula atual = this.ultima;
            for (int i = 999; i > 0; i--) {
                builder.append(atual.getElemento());
                builder.append(", ");
                atual = atual.getAnterior();
            }
            builder.append(atual.getElemento());
            builder.append("]");
            return builder.toString();
        }
    }
    public static void main(String[] args) {
        ListaDupla listaNros = new ListaDupla();
        int nros[] = new int[1000];
        Random gerador = new Random();
        for (int i = 0; i < 1000; i++) {
            int num = gerador.nextInt(19999)-9999;
            nros[i] = num;
        }
        System.out.println("Imprimir  vetor de numeros na ordem gerada: \n");
        System.out.print("[");
        for (int i : nros) {
            System.out.print(i+",");
        }
        System.out.print("]\n");
        Arrays.sort(nros);
        System.out.println("Imprimir vetor de numeros ordenados: \n");
        System.out.print("[");
        for (int i : nros) {
            System.out.print(i+",");
        }
        System.out.print("]\n");

        for (int i : nros) {
            listaNros.Adiciona(listaNros.totalElementos, i);
        }
        System.out.println("Imprimir Lista ordenada: \n"+listaNros.Imprimir());
        System.out.println("Imprimir Lista de tras pra frente: \n"+listaNros.ImprimirContrario());
    }
}
