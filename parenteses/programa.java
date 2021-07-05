package parenteses;

public class programa {
  public static void main(String[] args) {
    Stack stackOpen = new Stack();
    Stack stackClose = new Stack();
    int open = 0, close = 0;
    String certo = "";
    String parenteses = "( (  –  (  (  )  (  –  )  )  (  ())))";
    int length = parenteses.length();
    for (int i = 0; i < length; i++) {
      if(parenteses.charAt(i) == '('){
        stackOpen.push('(');
        open++;
      }else if(parenteses.charAt(i) == ')'){
        stackClose.push(')');
        close++;
      }
      if (open >= close) {
        certo = "Certinho abigo";
      }else{
        certo = "Errado manim";
        break;
      }

    }

    if (open > close) {
      certo = "Errado manim";
    }
    System.out.print(certo+": "+ parenteses);
    
  }
}
