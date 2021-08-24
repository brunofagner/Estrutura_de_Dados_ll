package AT_318;

import java.util.Scanner;

public class Fibonacci {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                System.out.println("(" + (i+1) + "):" + Fibonacci.fibo(i) + "\t");
            }else{
                System.out.println("(" + i + "):" + Fibonacci.fibo(i) + "\t");
            }
        }
        }

}