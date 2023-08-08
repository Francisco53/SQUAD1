
import java.util.Random;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a quantidade de números a serem sorteados: ");
        int quantidadeSorteio = scanner.nextInt();

        System.out.print("Digite o valor mínimo da faixa de sorteio: ");
        int minimo = scanner.nextInt();

        System.out.print("Digite o valor máximo da faixa de sorteio: ");
        int maximo = scanner.nextInt();

        System.out.println("Números sorteados:");

        for (int i = 0; i < quantidadeSorteio; i++) {
            int numeroSorteado = random.nextInt(maximo - minimo + 1) + minimo;
            System.out.print(numeroSorteado + " ");
        }

        scanner.close();
    }
}
