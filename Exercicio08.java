import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o numerador: ");
        int numerador = scanner.nextInt();

        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();

        if (denominador == 0){
            System.out.println("Erro! O denominador não pode ser zero.");
        } else {
            double resultado = (double) numerador / denominador;
            System.out.println("O número real equivalente é: " + resultado);

            scanner.close();
        }
        }
    
    }

