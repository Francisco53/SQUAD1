package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			
			System.out.print("Informa o salário (apenas números): ");
			double salary = sc.nextDouble();
			System.out.println("+-------------------+");
			System.out.println("| [1] - Diretoria   |");
			System.out.println("| [2] - Gerência    |");
			System.out.println("| [3] - Operacional |");
			System.out.println("+-------------------+");
			System.out.print("Informa o número correspondente ao cargo: ");
			int option = sc.nextInt();
			
			double loan;
			
			switch (option) {
			case 1: {
				loan = salary * 0.30;
				System.out.println("Valor do empréstimo: " + loan);
				break;
			}
			case 2: {
				loan = salary * 0.25;
				System.out.println("Valor do empréstimo: " + loan);
				break;
			}
			case 3: {
				loan = salary * 0.20;
				System.out.println("Valor do empréstimo: " + loan);
				break;
			}
			default:
				System.out.println("Opção inválida!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
