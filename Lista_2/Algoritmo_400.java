package Lista_2;
import java.util.Scanner;

public class Algoritmo_400 {
  public static void main(String[] args) {
    int leitos[] = new int[50], nd[] = new int[50], chave = 0, quarto, op;
    String sit[] = new String[50], din[]= new String[50], dout[] = new String[50],
    nome[]= new String[50], tel[] = new String[50] , resp, respl, nomep; 
    float precos[] = new float[50], despesas[] = new float[50], valor, total; 
    Scanner input = new Scanner(System.in);
    do {
      System.out.println("<<=====Hotel Fazenda Sucesso=====>>");
      System.out.println("l. Cadastra quartos ");
      System.out.println("2. Lista todos os quartos");
      System.out.println("3. Lista quartos desocupados");
      System.out.println("4. Aluguel / reserva quarto");
      System.out.println("5. Entra despesas extras ");
      System.out.println("6. Calcula despesa do quarto ");
      System.out.println("7. Sai");
      System.out.println("Opção: ");
      op = input.nextInt();
      if (op == 1) {
        if (chave == 1) {
          System.out.println("Atencao. Dados ja cadastrados");
        }else{
          for (int i = 0; i < 50; i++) {
            System.out.println("Quantidade de leitos para o quarto: "+(i+1));
            leitos[i] = input.nextInt();
            System.out.println("Preço do quarto: ");
            precos[i] = input.nextFloat();
            sit[i] = "L";
            nd[i] =  0;
            despesas[i] =  0;
            din[i] = "XXXX";
            dout[i] = "XXXX";
            nome[i] = "";
            tel[i] = "";
          }
          chave = 1;
        }
      }else if (op == 2) {
        if (chave == 0) {
          System.out.println("Escolha a opção 1");
        }else{
          for (int i = 0; i < 50; i++) {
            System.out.println("Numero do quarto: "+ (i+1));
            System.out.println("Situação do quarto"+ sit[i]);
            if (sit[i].equals("A") || sit[i].equals("R")){
              System.out.println("Nome: "+ nome[i]);
              System.out.println("Telefone: "+ tel[i]);
              System.out.println("Leitos: "+ leitos[i]);
              System.out.println("Preço do quarto: "+ precos[i]);
              System.out.println("Despesas: "+ despesas[i]);
              System.out.println("Data de entrada: "+ din[i]);
              System.out.println("Data de saida: "+ dout[i]);
              System.out.println("Numero de dias: "+ nd[i]);
            }
          }
        } 
      }else if(op == 3){
        if (chave == 0) {
          System.out.println("Escolha a opção 1!");
        }else{
          for (int i = 0; i < 50; i++) {
            if (sit[i].equals("A")){
              System.out.println("Numero do quarto: "+ (i+1));
              System.out.println("Despesas: "+ despesas[i]);
              System.out.println("Data de entrada: "+ din[i]);
              System.out.println("Data de saida: "+ dout[i]);
              System.out.println("Numero de dias: "+ nd[i]);
            }
          }
        }
      }else if (op == 4) {
        if (chave == 0) {
          System.out.println("Escolha a opção 1");
        }else{
          System.out.println("Digite A(aluguel)  R(Reserva): ");
          resp = input.next();
          while(!resp.equals("A") && !resp.equals("a") && !resp.equals("R") && !resp.equals("r")){
            System.out.println("Resposta invalida. Digite ( aluguel) R(reserva): ");
            resp = input.next();  
          }
          if (resp.equals("A") && resp.equals("a")) {
            System.out.println("Tinha reserva (s/n)?");
            respl = input.next();
            if (resp.equals("S") && resp.equals("s")) {
              System.out.println("Entre com o nome: ");
              nomep = input.next();
              int i = 0;
              while (!nomep.equals(nome[i]) && i < 49) {
                i++;
              }
              if (nomep.equals(nome[i])) {
                quarto = i;
                sit[i] = "A";
                despesas[i] = 0;
                System.out.println("Data de entrada: ");
                din[quarto] = input.next();
                System.out.println("Data de saida: ");
                dout[quarto] = input.next();
                System.out.println("Numero de dias: ");
                nd[quarto] = input.nextInt();
              }else{
                System.out.println("Reserva não encontrada");
                respl = "N";
              }
            }if (respl.equals("N") || respl.equals("n") || respl.equals("R") || respl.equals("r")){
              for (int i = 0; i < 50; i++) {
                if (sit[i].equals("L")) {
                  System.out.println("Numero do quarto: "+ (i+1));
                  System.out.println("Leitos: "+ leitos[i]);
                  System.out.println("Preço do quarto: "+ precos[i]);
                }  
              }
              System.out.println("Digite o numero do quarto para aluguel ou reserva: ");
              quarto = input.nextInt();
              while (quarto <1 || quarto > 50) {
                System.out.println("Quarto invalido. Entre novamente:");
                quarto = input.nextInt();
              }
              while (sit[quarto-1].equals("A")) {
                System.out.println("Quarto ocupado. Digite novamente");
                quarto = input.nextInt();
              }
              if (respl.equals("A") || respl.equals("a")) {
                sit[quarto-1] = "A";  
                despesas[quarto-1] = 0;
              }else{
                sit[quarto-1] = "R";
              }
              System.out.println("Digite o nome:");
              nome[quarto-1] = input.next();
              System.out.println("Digite telefone para contato:");
              tel[quarto-1] = input.next();
              System.out.println("Data de entrada: ");
              din[quarto-1] = input.next();
              System.out.println("Data de saida: ");
              dout[quarto-1] = input.next();
              System.out.println("Numero de dias: ");
              nd[quarto-1] = input.nextInt();
            }
          }
        }
      }else if (op == 5) {
        if (chave == 0) {
          System.out.println("Escolha a opção 1");
        }else{
          System.out.println("Entre com o numero do quarto: ");
          quarto = input.nextInt();
          while (quarto < 1 || quarto > 50) {
            System.out.println("Entre com o numero do quarto: ");
            quarto = input.nextInt();
          }
          System.out.println("Despesas: ");
          valor = input.nextFloat();
          despesas[quarto - 1] += valor; 
        }
      }else if (op == 6) {
        if (chave == 0) {
          System.out.println("Escolha a opção 1");
        }else{
          System.out.println("Entre com o numero do quarto: ");
          quarto = input.nextInt();
          while (quarto < 1 || quarto > 50) {
            System.out.println("Entre com o numero do quarto: ");
            quarto = input.nextInt();
          }
          total = despesas[quarto-1] + precos[quarto-1];
          System.out.println("Despesas: "+ total);
          sit[quarto-1] ="L";
          despesas[quarto - 1] = 0;
          din[quarto-1] = "XXXX";
          dout[quarto-1] ="XXXX"; 
          nd[quarto-1] = 0;
          nome[quarto-1] = "";
        }
      }else if (op == 7) {
        System.out.println("Saindo");
        
      }else{
        System.out.println("Opção invalida!");
      }
    }while (op != 7);
    input.close();
  }
}
