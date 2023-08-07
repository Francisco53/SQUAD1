
package listaexercicios03.basicoxavancado;

import java.util.Scanner;


public class Excercicio61 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int quantidadeLinhas = scanner.nextInt();

        for (int linha = 1; linha <= quantidadeLinhas; linha++) {
            for (int asteriscos = 1; asteriscos <= linha; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
