package filaLavaJato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Fila{
  ArrayList<Carro> carros = new ArrayList<>();

  void insere(Carro a){
    this.carros.add(a);
  }

  Carro remove(){
    return this.carros.remove(0);
  }

  boolean isEmpty(){
    return (this.carros.isEmpty());
  }

  int tamanho(){
    return carros.size();
  }

  void listar(){
    for (int i = 0; i < carros.size() ; i++) {
      this.carros.get(i).getCar();
     }
  }

  void ordenar(){
    ordenaPorNumero(carros);
  }

  private static void ordenaPorNumero(ArrayList<Carro> lista) {
    Collections.sort(lista, new Comparator<Carro>() {
        @Override
        public int compare(Carro o1, Carro o2) {
            return o1.nroIden.compareTo(o2.nroIden);
        }
     
  });
  }  
}