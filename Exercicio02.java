package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			System.out.print("Valor do salário adquirido: ");
			double salary = sc.nextDouble();
			System.out.print("Valor do salário mínimo: ");
			double minimumSalary = sc.nextDouble();
			
			System.out.printf("%.2f corresponde a %.2f salários mínimos.", salary, (salary/minimumSalary));
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
