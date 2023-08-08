

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();
        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        boolean horarioValido = false;

        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            horarioValido = true;
        }

        if (horarioValido) {
            System.out.println("O horário é válido.");
        } else {
            System.out.println("O horário é inválido.");
        }

        scanner.close();
    }
}
