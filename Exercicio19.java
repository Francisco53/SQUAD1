import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 <= numero2) {
            System.out.println("os números em ordem crescente: " + numero1 + " e " + numero2);
        } else {
            System.out.println(("Os números em ordem crescente: " + numero2 + " e " + numero1));
        }
    }
}
