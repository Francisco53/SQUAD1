import java.util.Scanner;
public class Exercicio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números impares entre " + numero1 + " e " + numero2 + ":");
        exibirNumerosImpares(numero1, numero2);
    }

        public static void exibirNumerosImpares(int numero1, int numero2){
            for (int i = numero1 + 1; i < numero2; i++) {
                if (i % 2 != 0){
                    System.out.println(i);
                }
    }
}
}
