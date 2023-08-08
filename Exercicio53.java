package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio53 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			System.out.print("Informa um número: ");
			int number = sc.nextInt();
			
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%4d x %2d = %4d\n", number, i, (number*i));
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
