package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio46 {
	public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);

            final int PEOPLE_QUANTITY = 5;

            char sex;
            int[] agesMen = new int[PEOPLE_QUANTITY];
            int[] agesWomen = new int[PEOPLE_QUANTITY];
            int menCounter = 0;
            int womenCounter = 0;

            for (int i = 0; i < PEOPLE_QUANTITY; i++) {
                System.out.print("Homem (M) ou mulher (F): ");
                sex = sc.next().toUpperCase().charAt(0);
                System.out.print("Idade: ");
                int age = sc.nextInt();

                if (sex == 'M') {
                    agesMen[menCounter] = age;
                    menCounter++;
                } else if (sex == 'F') {
                    agesWomen[womenCounter] = age;
                    womenCounter++;
                } else {
                    System.out.println("Gênero inválido. Use M para homem ou F para mulher.");
                    i--;
                }
            }

            int countMenOver18 = 0;
            for (int i = 0; i < menCounter; i++) {
                if (agesMen[i] >= 18) {
                    countMenOver18++;
                }
            }

            int countWomenOver18 = 0;
            for (int i = 0; i < womenCounter; i++) {
                if (agesWomen[i] >= 18) {
                    countWomenOver18++;
                }
            }

            System.out.println("Quantidade de homens maiores de idade: " + countMenOver18);
            System.out.println("Quantidade de mulheres maiores de idade: " + countWomenOver18);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
