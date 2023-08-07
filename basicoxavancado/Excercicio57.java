
package listaexercicios03.basicoxavancado;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Excercicio57 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira data (dia mês ano): ");
        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int ano1 = scanner.nextInt();

        System.out.print("Digite a segunda data (dia mês ano): ");
        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();
        int ano2 = scanner.nextInt();
        
        Calendar data1 = new GregorianCalendar(ano1, mes1 - 1, dia1); // Mês em Java é indexado de 0 a 11
        Calendar data2 = new GregorianCalendar(ano2, mes2 - 1, dia2);

        System.out.println("Datas entre " + formatarData(data1) + " e " + formatarData(data2) + ":");

        while (data1.before(data2)) {
            System.out.println(formatarData(data1));
            data1.add(Calendar.DAY_OF_MONTH, 1);
        }

        scanner.close();
    }
    
    public static String formatarData(Calendar data) {
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int mes = data.get(Calendar.MONTH) + 1; // Somar 1 pois o mês é indexado de 0 a 11
        int ano = data.get(Calendar.YEAR);
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    
}
