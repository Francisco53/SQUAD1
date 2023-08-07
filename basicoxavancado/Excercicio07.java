
package listaexercicios03.basicoxavancado;

import java.util.Scanner;


public class Excercicio07 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da despesa do cliente: ");
        double valorDespesa = scanner.nextDouble();

        double comissao = valorDespesa * 0.10;

        System.out.println("A comissão do garçom é: R$" + comissao);
    }
    
}
