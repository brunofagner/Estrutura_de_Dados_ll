package LHDeque;

import java.util.Deque;
import java.util.Random;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class FHDeque {
    public static void main(String[] args) {
        Deque<Pessoa> naoAtendidas = new ArrayDeque<Pessoa>();
        Deque<Pessoa> aux0 = new ArrayDeque<Pessoa>();
        Deque<Pessoa> aux1 = new ArrayDeque<Pessoa>();
        Deque<Pessoa> aux2 = new ArrayDeque<Pessoa>();
        Deque<Pessoa> aux3 = new ArrayDeque<Pessoa>();
        Deque<Pessoa> atendidas = new ArrayDeque<Pessoa>();
        ArrayList<String> sexos = new ArrayList<String>();
        sexos.add("Masculino");
        sexos.add("Feminino");
        Random gerador = new Random();
        int id = 1;
        for (int i = 0; i < 10; i++) {
            String sexo = sexos.get(gerador.nextInt(2));
            int idade = gerador.nextInt(59)+1;
            aux2.addLast(new Pessoa(2, id, sexo, idade, false, false, true));
            id++;
            for(int h = 0; h < 5; h++){
                sexo = sexos.get(gerador.nextInt(2));
                idade = gerador.nextInt(59)+1;
                aux0.addLast(new Pessoa(0, id, sexo, idade, false, false, false));
                id++;
            }
            sexo = sexos.get(1);
            idade = gerador.nextInt(41)+18;
            aux3.addLast(new Pessoa(3, id, sexo, idade, true, true, false));
            id++;
            for(int h = 0; h < 3; h++){
                sexo = sexos.get(gerador.nextInt(2));
                idade = gerador.nextInt(61)+60;
                aux1.addLast(new Pessoa(1, id, sexo, idade, false, false, false));
                id++;
            }
            
            for (int j = 1; j <= naoAtendidas.size(); j++) {
                if (naoAtendidas.getFirst().prioridade == 3) {
                    aux3.addLast(naoAtendidas.removeFirst());
                }else if (naoAtendidas.getFirst().prioridade == 2) {
                    aux2.addLast(naoAtendidas.removeFirst());
                }else if (naoAtendidas.getFirst().prioridade == 1) {
                    aux1.addLast(naoAtendidas.removeFirst());
                }else if (naoAtendidas.getFirst().prioridade == 0) {
                    aux0.addLast(naoAtendidas.removeFirst());
                }
            }
            for (int j = 0; j <= aux3.size(); j++) {
                naoAtendidas.addLast(aux3.removeFirst());
            }
            for (int j = 0; j <= aux2.size(); j++) {
                naoAtendidas.addLast(aux2.removeFirst());
            }
            for (int j = 0; j <= aux1.size(); j++) {
                naoAtendidas.addLast(aux1.removeFirst());
            }
            for (int j = 0; j <= aux0.size(); j++) {
                naoAtendidas.addLast(aux0.removeFirst());
            }

            for (int f = 0; f < i+1 ; f++) {
                atendidas.addLast(naoAtendidas.removeFirst());
            }
        } 
        System.out.println("Pessoas não atendidas: " +naoAtendidas);
        System.out.println("Pessoas atendidas: " +atendidas);
    }
}