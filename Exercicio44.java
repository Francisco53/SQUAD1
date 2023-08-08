
package listaexercicios03.basicoxavancado;

import java.util.Random;
import java.util.Scanner;


public class Excercicio44 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores: ");
        int quantidadeValores = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / quantidadeValores;

        System.out.println("A média aritmética dos " + quantidadeValores + " valores fornecidos é: " + media);

        scanner.close();
    }
    
}
