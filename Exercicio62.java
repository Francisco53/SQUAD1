import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
