
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPacientes = 0;
        int totalHomens = 0;
        int totalMulheresAlturaPeso = 0;
        int totalPessoasIdade1825 = 0;
        int idadeHomens = 0;
        int totalIdadeMulheres = 0;
        int idadeMaisVelho = 0;
        int alturaMaisBaixaMulher = Integer.MAX_VALUE;
        String nomeMaisVelho = "";
        String nomeMaisBaixaMulher = "";

        System.out.println("Digite os dados dos pacientes (nome, sexo, peso, idade e altura) ou digite 'fim' para encerrar:");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura: ");
            int altura = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            totalPacientes++;

            if (sexo == 'M') {
                totalHomens++;
                idadeHomens += idade;
            } else if (sexo == 'F' && altura >= 160 && altura <= 170 && peso > 70) {
                totalMulheresAlturaPeso++;
            }

            if (idade >= 18 && idade <= 25) {
                totalPessoasIdade1825++;
            }

            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }

            if (sexo == 'F' && altura < alturaMaisBaixaMulher) {
                alturaMaisBaixaMulher = altura;
                nomeMaisBaixaMulher = nome;
            }

            totalIdadeMulheres += idade;
        }

        double mediaIdadeHomens = totalHomens == 0 ? 0 : (double) idadeHomens / totalHomens;
        double mediaIdadeMulheres = totalPacientes - totalHomens == 0 ? 0 : (double) totalIdadeMulheres / (totalPacientes - totalHomens);

        System.out.println("\nRelatório da Clínica:");
        System.out.println("Quantidade de pacientes: " + totalPacientes);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + totalMulheresAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + totalPessoasIdade1825);
        System.out.println("Nome do paciente mais velho: " + nomeMaisVelho);
        System.out.println("Nome da mulher mais baixa: " + nomeMaisBaixaMulher);

        scanner.close();
    }
}
