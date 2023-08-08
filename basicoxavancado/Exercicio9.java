
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do usuário: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("O usuário é maior de idade.");
        } else {
            System.out.println("O usuário é menor de idade.");
        }

        scanner.close();
    }
}
