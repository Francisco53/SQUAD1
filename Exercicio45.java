package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio45 {
	public static void main(String[] args) {
        Scanner sc = null;

        try {
        	sc = new Scanner(System.in);
        	
        	final int TOTAL_NUMBERS = 100;
            int maxNumber = Integer.MIN_VALUE;

            System.out.println("Digite " + TOTAL_NUMBERS + " números:");

            for (int i = 0; i < TOTAL_NUMBERS; i++) {
                int number = sc.nextInt();
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }

            System.out.println("O maior valor entre os números fornecidos é: " + maxNumber);
        } catch (InputMismatchException e) {
        	System.out.println("Entrada inválida.");
		} finally {
        	if (sc != null) {
        		sc.close();
        	}
        }
    }
}
