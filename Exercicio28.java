
import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;


            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }

        System.out.println("Em ordem crescente: " + num1 + ", " + num2 + ", " + num3);

        input.close();
    }
}
