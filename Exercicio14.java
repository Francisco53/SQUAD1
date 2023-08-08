
package listaexercicios03.basicoxavancado;

import java.util.Scanner;


public class Excercicio14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de um mês: ");
        String nomeMes = scanner.nextLine();

        int numeroMes = obterNumeroMes(nomeMes);

        if (numeroMes != -1) {
            System.out.println("O número equivalente do mês " + nomeMes + " é: " + numeroMes);
        } else {
            System.out.println("Mês inválido!");
        }

        scanner.close();
    }
    
    public static int obterNumeroMes(String nomeMes){
        switch (nomeMes.toLowerCase()) {
            case "janeiro":
                return 1;
            case "fevereiro":
                return 2;
            case "março":
                return 3;
            case "abril":
                return 4;
            case "maio":
                return 5;
            case "junho":
                return 6;
            case "julho":
                return 7;
            case "agosto":
                return 8;
            case "setembro":
                return 9;
            case "outubro":
                return 10;
            case "novembro":
                return 11;
            case "dezembro":
                return 12;
            default:
                return -1;
        }
    }
    
}
