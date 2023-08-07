
package listaexercicios03.basicoxavancado;

import java.util.Random;


public class Excercicio42 {
    
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Lista de 40 grupos de 3 números sorteados:");

        for (int i = 0; i < 40; i++) {
            int[] grupo = gerarGrupoSorteado(random);
            ordenarGrupo(grupo);
            exibirGrupo(grupo);
        }
    }
    
    public static int[] gerarGrupoSorteado(Random random) {
        int[] grupo = new int[3];
        for (int i = 0; i < 3; i++) {
            grupo[i] = random.nextInt(60); // Gera número de 0 a 59
        }
        return grupo;
    }
    
    public static void ordenarGrupo(int[] grupo) {
        for (int i = 0; i < grupo.length - 1; i++) {
            for (int j = i + 1; j < grupo.length; j++) {
                if (grupo[i] > grupo[j]) {
                    int temp = grupo[i];
                    grupo[i] = grupo[j];
                    grupo[j] = temp;
                }
            }
        }
    }
    
    public static void exibirGrupo(int[] grupo) {
        System.out.print("Grupo: ");
        for (int i = 0; i < grupo.length; i++) {
            System.out.print(grupo[i] + " ");
        }
        System.out.println();
    }
    
}
