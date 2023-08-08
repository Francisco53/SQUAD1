package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			System.out.print("Informa o nome da primeira pessoa: ");
			String nameA = sc.nextLine();
			System.out.print("Informa o dia de nascimento da primeira pessoa: ");
			int dayA = sc.nextInt();
			System.out.print("Informa o mês de nascimento da primeira pessoa: ");
			int monthA = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Informa o nome da segunda pessoa: ");
			String nameB = sc.nextLine();
			System.out.print("Informa o dia de nascimento da segunda pessoa: ");
			int dayB = sc.nextInt();
			System.out.print("Informa o mês de nascimento da segunda pessoa: ");
			int monthB = sc.nextInt();
			
			if (monthA < monthB || (monthA == monthB && dayA <= dayB)) {
	            System.out.println(nameA + " faz aniversário primeiro.");
	        } else {
	            System.out.println(nameB + " faz aniversário primeiro.");
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
