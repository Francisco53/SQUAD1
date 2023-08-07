import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor inicial em reais: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Informe o valor final em reais: ");
        double valorFinal = scanner.nextDouble();

        System.out.print("Informe o valor de incremento em reais: ");
        double incremento = scanner.nextDouble();

        System.out.print("Informe o valor de 1 dólar em reais: ");
        double valorDolar = scanner.nextDouble();

        System.out.println("\nTabela de Conversão de Reais para Dólares:");
        System.out.println("--------------------------------------");
        System.out.println("|   Reais   |   Dólares   |");
        System.out.println("--------------------------------------");

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        for (double valor = valorInicial; valor <= valorFinal; valor += incremento) {
            double valorConvertido = valor / valorDolar;
            System.out.println("|  R$ " + decimalFormat.format(valor) + "  |  $" + decimalFormat.format(valorConvertido) + "  |");
        }

        System.out.println("--------------------------------------");
    }
}