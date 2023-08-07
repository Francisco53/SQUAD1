
package listaexercicios03.basicoxavancado;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Excercicio58 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data (dd/mm/yyyy): ");
        String dataStr = scanner.nextLine();

        System.out.print("Digite a quantidade de dias a somar: ");
        int quantidadeDias = scanner.nextInt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            Date data = dateFormat.parse(dataStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(data);
            calendar.add(Calendar.DAY_OF_MONTH, quantidadeDias);

            Date novaData = calendar.getTime();
            String novaDataStr = dateFormat.format(novaData);
            System.out.println("Data após a soma: " + novaDataStr);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
    
}
