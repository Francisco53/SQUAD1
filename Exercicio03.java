import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de homens: ");
        int quantidadeHomens = scanner.nextInt();
        
        System.out.print("Digite a quantidade de mulheres: ");
        int quantidadeMulheres = scanner.nextInt();
        
        int quantidadeTotal = quantidadeHomens + quantidadeMulheres;
        
        double percentualHomens = (double) quantidadeHomens / quantidadeTotal * 100;
        double percentualMulheres = (double) quantidadeMulheres / quantidadeTotal * 100;
        
        System.out.println("Percentual de homens: " + percentualHomens + "%");
        System.out.println("Percentual de mulheres: " + percentualMulheres + "%");
        
        scanner.close();
        
    }
}