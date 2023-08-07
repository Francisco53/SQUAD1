import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioBruto = 0;
        double descontos = 0;
        double valorEmprestimo = 0;

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite o valor do salário bruto: ");
                salarioBruto = scanner.nextDouble();

                System.out.print("Digite o valor dos descontos: ");
                descontos = scanner.nextDouble();

                System.out.print("Digite o valor do empréstimo: ");
                valorEmprestimo = scanner.nextDouble();

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um valor válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        double salarioLiquido = salarioBruto - descontos;
        double limiteEmprestimo = salarioLiquido * 0.3;

        if (valorEmprestimo <= limiteEmprestimo) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.print("Empréstimo negado! O valor máximo de empréstimo é de " + limiteEmprestimo);
        }

        scanner.close();
    }
}