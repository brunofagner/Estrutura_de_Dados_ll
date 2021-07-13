public class Hanoi{
  public static void main(String[] args) {
    long tempoInicial = System.currentTimeMillis();
    int discos = 30; //1,10,20,30,40,41
    hanoi(discos,'A', 'B', 'C');
    long tempoFinal = System.currentTimeMillis();
    long tempoTotal = tempoFinal - tempoInicial;
    int miliSegundos = (int) tempoTotal%1000;
    int segundos = (int)( tempoTotal / 1000 ) % 60;     
    int minutos  = (int)( tempoTotal / 60000 ) % 60;    
    int horas    = (int) tempoTotal / 3600000;          
    System.out.println( String.format( "%02d:%02d:%02d:%03d", horas, minutos, segundos, miliSegundos) );
    
  }

  private static void hanoi(int discos, char origem, char aux, char destino) {
    if(discos > 0){
      hanoi(discos - 1, origem, destino, aux);
      System.out.printf("%s -> %s\n", origem, destino);
      hanoi(discos-1, aux, origem, destino);
    }
  }
}