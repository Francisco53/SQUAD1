import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o número do mês: ");
        int mes = scanner.nextInt();

        if (verificarDataAniversario(dia, mes)) {
            String nomeMes = obterNomeMes(mes);
            String trimestre = obterTrimestreNascimento(mes);
            String signo = obterSignoHoroscopo(dia, mes);
            System.out.println("Data de aniversário válida!\nMês: " + nomeMes);
            System.out.println("Trimestre de nascimento: " + trimestre);
            System.out.println("Signo do horóscopo: " + signo);
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

    public static String obterTrimestreNascimento(int mes) {
        if (mes >= 1 && mes <= 3) {
            return "1º trimestre";
        } else if (mes >= 4 && mes <= 6) {
            return "2º trimestre";
        } else if (mes >= 7 && mes <= 9) {
            return "3º trimestre";
        } else if (mes >= 10 && mes <= 12) {
            return "4º trimestre";
        } else {
            return "Mês Inválido";
        }
    }

    public static String obterSignoHoroscopo(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Aquário";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Peixes";
        } else {
            return "Data Inválida";
        }
    }
}