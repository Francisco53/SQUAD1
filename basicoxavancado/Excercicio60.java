
package listaexercicios03.basicoxavancado;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Excercicio60 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double valorDivida = scanner.nextDouble();

        System.out.print("Digite a taxa de correção mensal (%): ");
        double taxaCorrecao = scanner.nextDouble() / 100.0;

        System.out.print("Digite a quantidade de anos: ");
        int quantidadeAnos = scanner.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Anos\tJan\tFev\tMar\tAbr\tMai\tJun\tJul\tAgo\tSet\tOut\tNov\tDez");
        
        for (int ano = 2007; ano <= 2007 + quantidadeAnos; ano++) {
            System.out.print(ano + "\t");

            double valorAtual = valorDivida;
            for (int mes = 1; mes <= 12; mes++) {
                double correcao = valorAtual * taxaCorrecao;
                valorAtual += correcao;
                System.out.print(decimalFormat.format(valorAtual) + "\t");
            }

            System.out.println();
        }
    }
    
}
