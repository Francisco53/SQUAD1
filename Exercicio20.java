
package listaexercicios03.basicoxavancado;

import java.util.Scanner;


public class Excercicio20 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite os dados da segunda pessoa:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade2 = scanner.nextInt();

        String maisVelha = (idade1 > idade2) ? nome1 : nome2;
        String maisNova = (idade1 < idade2) ? nome1 : nome2;

        System.out.println("Pessoa mais velha: " + maisVelha);
        System.out.println("Pessoa mais nova: " + maisNova);

        scanner.close();
    }
    
}
