package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			final int NOTE_QUANTITY = 4;

			double[] notes = new double[NOTE_QUANTITY];
			double sum = 0.0f;

			for (int i = 0; i < NOTE_QUANTITY; i++) {
				System.out.print("Informa a nota " + (i + 1) + ": ");
				notes[i] = sc.nextDouble();
				sum += notes[i];
			}

			double avg = sum / NOTE_QUANTITY;

			System.out.printf("A média aritmética das notas apresentadas é: %.2f\n", avg);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida.");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
