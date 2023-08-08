package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio50 {
	public static void main(String[] args) {
        Scanner sc = null;

        try {
        	sc = new Scanner(System.in);
        	
	        System.out.print("Informe o valor de n para obter o n-ésimo termo da sequência de Fibonacci: ");
	        int n = sc.nextInt();
	
	        long firstTerm = 1;
	        long secondTerm = 1;
	        long nTerm = 0;
	
	        if (n <= 0) {
	            System.out.println("O valor de n deve ser positivo e maior que zero.");
	        } else if (n == 1 || n == 2) {
	            nTerm = 1;
	        } else {
	            for (int i = 3; i <= n; i++) {
	                nTerm = firstTerm + secondTerm;
	                firstTerm = secondTerm;
	                secondTerm = nTerm;
	            }
	        }
	
	        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + nTerm);
        } catch (InputMismatchException e) {
        	System.out.println("Entrada inválida.");
		} finally {
        	if (sc != null) {
        		sc.close();
        	}
        }
    }
}
