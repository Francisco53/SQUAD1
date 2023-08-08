package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			System.out.print("Informa a quantidade de pessoas: ");
			int quantity = sc.nextInt();
			
			int[] ages = new int[quantity];
			int sum = 0;
			int oldest = Integer.MIN_VALUE;
			int youngest = Integer.MAX_VALUE;
			int olderPeopleNumber = 0;
			
			for (int i = 0; i < quantity; i++) {
				System.out.print("Idade da pessoa " + (i + 1) + ": ");
				ages[i] = sc.nextInt();
				
				sum += ages[i];
				if (ages[i] > oldest) {
					oldest = ages[i];
				}
				if (ages[i] < youngest) {
					youngest = ages[i];
				}
				if (ages[i] >= 18) {
					olderPeopleNumber++;
				}
			}
			
			double avg = (double) sum / quantity;
			
			System.out.println("Média das idades: " + avg);
	        System.out.println("Maior idade: " + oldest);
	        System.out.println("Menor idade: " + youngest);
	        System.out.println("Quantidade de pessoas maior de idade: " + olderPeopleNumber);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
