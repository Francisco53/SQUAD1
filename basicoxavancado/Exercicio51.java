//Grupo 4: [51, 28, 32, 55, 56, 47, 34, 6, 11, 62, 25, 35, 18, 33, 9, 59]


import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio51 {
    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> fibonacciSeq = new ArrayList<>();
        if (n == 0) {
            return fibonacciSeq;
        } else if (n == 1) {
            fibonacciSeq.add(1);
            return fibonacciSeq;
        } else if (n == 2) {
            fibonacciSeq.add(1);
            fibonacciSeq.add(1);
            return fibonacciSeq;
        } else if (n == 3) {
            fibonacciSeq.add(1);
            fibonacciSeq.add(1);
            fibonacciSeq.add(2);
            return fibonacciSeq;
        }
        
        fibonacciSeq.add(1);
        fibonacciSeq.add(1);
        fibonacciSeq.add(2);
        for (int i = 3; i < n; i++) {
            int nextTerm = fibonacciSeq.get(i - 1) + fibonacciSeq.get(i - 2) + fibonacciSeq.get(i - 3);
            fibonacciSeq.add(nextTerm);
        }
        
        return fibonacciSeq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da sequência de Fibonacci que deseja exibir: ");
        int n = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> result = fibonacci(n);
        System.out.println(result);
    }
}
