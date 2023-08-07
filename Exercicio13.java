import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0 ) {
            System.out.print("Aluno aprovado!");
        } else if (media >=5.0 && media <7.0) {
            System.out.println("Aluno em recuperação!");

            System.out.print("Digite a nota da prova final: ");
            double notaFinal = scanner.nextDouble();

            media = (media + notaFinal) / 2;

            if (media >= 5.0) {
                System.out.println("Aluno aprovado após a prova final!");

            } else {
                System.out.print("Aluno reprovado após a prova final!!");
            }
        } else {
            System.out.println("Aluno reprovado!");


        }
    }
}


