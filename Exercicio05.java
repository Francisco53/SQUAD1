package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			System.out.println("Informa o valor inicial do débito:");
			double money = sc.nextDouble();
			System.out.println("Informa a quantidade de meses:");
			int months = sc.nextInt();
			System.out.println("Informa o valor dos juros mensais (em porcento):");
			double interest = sc.nextDouble();
			
			double amount = money + (money * interest/100 * months);
			
			System.out.println("Valor final: " + amount);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
