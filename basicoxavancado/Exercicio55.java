
import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'a';


        double valorMensal = 50.0;
        int minutosInclusos = 100;
        int minutosBonus = 50;
        double valorMinutoVaiVai = 0.20;
        double valorMinutoOutrasOperadoras = 0.65;
        double valorMinutoTelefoneFixo = valorMinutoOutrasOperadoras / 2;


        double saldo = valorMensal;
        double valorAPagar = 0.0;

        do {
            System.out.print("Digite o tipo de ligação ('o' para outras operadoras, 'v' para Vai-Vai ou 'f' para telefone fixo): ");
            char tipoLigacao = scanner.next().charAt(0);
            System.out.print("Digite a quantidade de minutos: ");
            int minutos = scanner.nextInt();

            
            if (tipoLigacao == 'o') {
                valorAPagar = minutos * valorMinutoOutrasOperadoras;
            } else if (tipoLigacao == 'v') {
                valorAPagar = minutos * valorMinutoVaiVai;
                minutos += minutosBonus; 
            } else if (tipoLigacao == 'f') {
                valorAPagar = minutos * valorMinutoTelefoneFixo;
            } else {
                System.out.println("Tipo de ligação inválido!");
                continue; 
            }


            if (minutos > minutosInclusos) {
                int minutosExcedentes = minutos - minutosInclusos;
                valorAPagar += minutosExcedentes * valorMinutoOutrasOperadoras;
            }
           
            saldo -= valorAPagar;

            System.out.println("Saldo: R$" + saldo);
            System.out.println("Valor a pagar: R$" + valorAPagar);

            System.out.print("Deseja fazer outra ligação? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("Fim do programa!");
        scanner.close();
    }
}
