package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			System.out.print("Informa o ano de nascimento: ");
			int birthYear = sc.nextInt();
			System.out.print("Informa o ano atual: ");
			int currentYear = sc.nextInt();
			
			System.out.println("A idade feita neste ano (" + currentYear + ") é: " + (currentYear - birthYear));
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
