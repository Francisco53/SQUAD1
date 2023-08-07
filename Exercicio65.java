import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas da pirâmide: ");
        int linhas = scanner.nextInt();

        int espacos = linhas - 1;
        int asteriscos = 1;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();

            espacos--;
            asteriscos += 2;
        }

        scanner.close();
    }
}