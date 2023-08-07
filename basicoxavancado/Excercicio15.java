
package listaexercicios03.basicoxavancado;

import java.util.Scanner;


public class Excercicio15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o número do mês: ");
        int mes = scanner.nextInt();

        if (verificarDataAniversario(dia, mes)) {
            String nomeMes = obterNomeMes(mes);
            System.out.println("Data de aniversário válida! Mês: " + nomeMes);
        } else {
            System.out.println("Data de aniversário inválida!");
        }

        scanner.close();
    }
    
    public static boolean verificarDataAniversario(int dia, int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        } else if (mes == 2) {
            return dia <= 29; // Considerando que estamos tratando apenas do dia e mês
        } else {
            return dia <= 31;
        }
    }
    
    public static String obterNomeMes(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês Inválido";
        }
    }
    
}
