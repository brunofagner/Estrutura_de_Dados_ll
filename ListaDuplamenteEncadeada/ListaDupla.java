package ListaDuplamenteEncadeada;


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

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        //1
        lista.Adiciona("Homer");
        lista.Adiciona("Marge");
        System.out.println(lista.Imprimir());
        //2
        lista.EsvaziaLista();
        System.out.println(lista.Imprimir());
        //3
        lista.Adiciona("Homer");
        lista.Adiciona(0, "Bart");
        lista.Adiciona(1, "Moll");
        System.out.println(lista.Imprimir());
        //4
        lista.EsvaziaLista();
        //5
        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        lista.AdicionarComeco("Lisa");
        System.out.println(lista.Imprimir());
        System.out.println(lista.Tamanho());
        //6
        lista.EsvaziaLista();
        //7
        lista.Adiciona("Homer");
        lista.Adiciona("Maggie");
        lista.Adiciona(0, "Bart");
        lista.Adiciona(1, "Marge");
        System.out.println(lista.Imprimir());
        System.out.println(lista.Contem("lisa"));
        //8
        lista.EsvaziaLista();
        //9
        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        System.out.println(lista.Imprimir());
        System.out.println(lista.Tamanho());
        //10
        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Bart"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());
        //11
        lista.EsvaziaLista();
        //12
        lista.AdicionarComeco("Homer");
        lista.AdicionarComeco("Bart");
        lista.Adiciona("Marge");
        lista.Adiciona(1, "Maggie");
        lista.AdicionarComeco("Ned Flanders");
        lista.Adiciona(lista.totalElementos, "Sr. Burns");
        System.out.println(lista.Imprimir());
        //13
        lista.RemoveFim();
        System.out.println(lista.Imprimir());
        //14
        lista.Remove(1);
        System.out.println(lista.Imprimir());
        System.out.println(lista.Tamanho());
        //15
        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Bart"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());
        //16
        lista.RemoveComeco();
        System.out.println(lista.Imprimir());
        System.out.println(lista.Tamanho());
        //17
        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Bart"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());
        //18
        lista.EsvaziaLista();
        System.out.println(lista.Imprimir());
    }
}
