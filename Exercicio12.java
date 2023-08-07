import java.util.Scanner;
public class Exercicio12 {
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
            System.out.print("Aluno de recuperação!");
        } else {
            System.out.print("Aluno reprovado!");


            }
        }
    }

