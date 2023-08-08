package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio43 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			final int VALUES_QUANTITY = 500;
			
			int count = 0;
			double sum = 0.0f;
			
			while (count < VALUES_QUANTITY) {
				
				sum += sc.nextDouble();
				
				count++;
			}
			
			double avg;
			avg = sum / count;
			
			System.out.println("A média aritmética dos " + count + " valores informados é: " + avg);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
