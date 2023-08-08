
import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro candidato:");
        String candidato1 = scanner.nextLine();

        System.out.println("Digite o nome do segundo candidato:");
        String candidato2 = scanner.nextLine();

        System.out.println("Digite o nome do terceiro candidato:");
        String candidato3 = scanner.nextLine();

        int totalVotos = 0;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosEmBranco = 0;

        System.out.println("Votação iniciada! Digite o número do candidato que deseja votar (1, 2, 3) ou digite 0 para voto em branco.");

        int voto;
        do {
            System.out.print("Voto: ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    totalVotos++;
                    break;
                case 2:
                    votosCandidato2++;
                    totalVotos++;
                    break;
                case 3:
                    votosCandidato3++;
                    totalVotos++;
                    break;
                case 0:
                    votosEmBranco++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Voto inválido! Tente novamente.");
            }
        } while (voto != -1); // Insira -1 para finalizar a votação

        double percentualCandidato1 = (votosCandidato1 * 100.0) / totalVotos;
        double percentualCandidato2 = (votosCandidato2 * 100.0) / totalVotos;
        double percentualCandidato3 = (votosCandidato3 * 100.0) / totalVotos;
        double percentualVotosEmBranco = (votosEmBranco * 100.0) / totalVotos;

        System.out.println("\nResultado da eleição:");
        System.out.println("Total de votos: " + totalVotos);
        System.out.println("Votos em branco: " + votosEmBranco + " (" + percentualVotosEmBranco + "%)");

        System.out.println("\nCandidato 1 (" + candidato1 + "):");
        System.out.println("Votos: " + votosCandidato1 + " (" + percentualCandidato1 + "%)");

        System.out.println("\nCandidato 2 (" + candidato2 + "):");
        System.out.println("Votos: " + votosCandidato2 + " (" + percentualCandidato2 + "%)");

        System.out.println("\nCandidato 3 (" + candidato3 + "):");
        System.out.println("Votos: " + votosCandidato3 + " (" + percentualCandidato3 + "%)");

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("\nO candidato vencedor é " + candidato1 + "!");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println("\nO candidato vencedor é " + candidato2 + "!");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println("\nO candidato vencedor é " + candidato3 + "!");
        } else {
            System.out.println("\nA eleição terminou empatada!");
        }

        scanner.close();
    }
}
