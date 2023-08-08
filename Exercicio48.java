package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio48 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			final int CLASSES = 20;
			
			System.out.print("Digita a quantidade de notas: ");
	        int notesQuantity = sc.nextInt();

	        double sum = 0;
	        int absences;
	        double avg;
	        double note;
	        
	        System.out.print("Digita a quantidade de faltas: ");
	        absences = sc.nextInt();

	        for (int i = 1; i <= notesQuantity; i++) {
	            System.out.print("Digita a nota " + i + ": ");
	            note = sc.nextDouble();
	            sum += note;
	        }

	        avg = sum / notesQuantity;
	        double frequence = (1.0 - ((double) absences / (double) CLASSES)) * 100;

	        System.out.println("Média: " + avg);
	        System.out.println("Frequência: " + frequence + "%");

	        if (avg >= 6.0 && frequence >= 75) {
	            System.out.println("Aluno aprovado.");
	        } else if (avg >= 3.0 && frequence >= 75) {
	            System.out.println("Aluno reprovado por nota.");
	        } else {
	            System.out.println("Aluno reprovado por faltas.");
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
