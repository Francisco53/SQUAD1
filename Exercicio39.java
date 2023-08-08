
package listaexercicios03.basicoxavancado;

import java.util.Scanner;


public class Excercicio39 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é perfeito: ");
        int numero = scanner.nextInt();

        boolean ehPerfeito = verificarNumeroPerfeito(numero);

        if (ehPerfeito) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        scanner.close();
    }
    
    public static boolean verificarNumeroPerfeito(int num) {
        if (num <= 1) {
            return false;
        }

        int somaDivisores = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == num;
    }
    
}
