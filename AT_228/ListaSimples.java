package AT_228;

import java.util.Scanner;

public class ListaSimples {
    No inicio = null;
    int tamanho = 0;

    public void inserirInicio(String placa){
        No no = new No(placa);
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }
    public void inserirInicio(No carro){
        No no = new No(carro);
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }
    public No retirarInicio(){
        if (inicio == null) {
            return null;
        }
        No aux = inicio;
        inicio = inicio.proximo;
        tamanho--;
        aux.vezes++;
        return aux;
    }

    public void inserirFim(String placa){
        No no = new No(placa);
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


    public Object selecionarIndice(String placa){
        No local = inicio;
        for (int i = 0; i < this.tamanho; i++) {
            if (local.placa.equals(placa)) {
                return i;
            }
            local = local.proximo;
        }
        return null;
    }

    public static void main(String [] args){
        ListaSimples naFila = new ListaSimples();
        ListaSimples aux = new ListaSimples();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Oque deseja fazer?");
                String comando = input.nextLine();
                String[] palavras = comando.split("\\s+");
                if (palavras[0].equals("E")) {
                    if (naFila.tamanho == 10) {
                        System.out.println("Carro foi embora, sem espaço!");
                    }else{
                        naFila.inserirFim(palavras[1]);
                        System.out.println("Carro "+ palavras[1] +" entrou");
                    }
                }else if(palavras[0].equals("S")){
                    if (naFila.selecionarIndice(palavras[1]) == null) {
                      System.out.println("Carro não encontrado");  
                    }else{
                        for (int i = 0; i < (int)naFila.selecionarIndice(palavras[1]); i++) {
                            aux.inserirInicio(naFila.retirarInicio());
                        }
                        No carroSaiu = naFila.retirarInicio();
                        System.out.println("Carro "+ carroSaiu.placa+" manobrou "+ carroSaiu.vezes);
                        for (int i = 0; i < aux.tamanho; i++) {
                            naFila.inserirInicio(aux.retirarInicio());
                        }
                    }
                }else{
                    System.out.println("Opção invalida!");
                    break;
                }
        }
        input.close();
    }    
}