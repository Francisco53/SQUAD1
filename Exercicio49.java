package application;

public class Exercicio49 {
	public static void main(String[] args) {
		
		final int FIBONACCI_QUANTITY_TERMS = 50;
		
		long firstTerm = 1;
        long secondTerm = 1;
        
        System.out.print("Os primeiros " + FIBONACCI_QUANTITY_TERMS + " números da sequência de Fibonacci são: ");
        
        for (int i = 0; i < FIBONACCI_QUANTITY_TERMS; i++) {
        	if (i + 1 == FIBONACCI_QUANTITY_TERMS) {
        		System.out.print(firstTerm);
        	} else {
        		System.out.print(firstTerm + ", ");
        	}
            
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
	}
}
