package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
        Scanner sc = null;

        try {
        	sc = new Scanner(System.in);
        	
        	System.out.print("Digita o primeiro horário (HH:MM:SS): ");
            String time1 = sc.nextLine();

            System.out.print("Digita o segundo horário (HH:MM:SS): ");
            String time2 = sc.nextLine();

            int secondsTime1 = convertToSeconds(time1);
            int secondsTime2 = convertToSeconds(time2);

            int diferencaSegundos = Math.abs(secondsTime1 - secondsTime2);

            System.out.println("A diferença entre os horários é de " + diferencaSegundos + " segundos.");
        } catch (InputMismatchException e) {
        	System.out.println("Entrada inválida.");
		} finally {
        	if (sc != null) {
        		sc.close();
        	}
        }
    }
	
	public static int convertToSeconds(String time) {
		String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        return hours * 3600 + minutes * 60 + seconds;
	}
}
