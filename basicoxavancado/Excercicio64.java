
package listaexercicios03.basicoxavancado;

import java.util.Scanner;


public class Excercicio64 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de triângulos: ");
        int quantidadeTriangulos = scanner.nextInt();

        for (int i = 1; i <= quantidadeTriangulos; i++) {
            desenharTriangulo(i);
        }
    }
    
    public static void desenharTriangulo(int linhas) {
        for (int linha = 1; linha <= linhas; linha++) {
            for (int asteriscos = 1; asteriscos <= linha; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
