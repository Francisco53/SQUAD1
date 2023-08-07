
package listaexercicios03.basicoxavancado;

import java.util.Scanner;
import java.util.Random;

public class Excercicio41 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente descobrir o número sorteado de 1 a 100.");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
    
}
