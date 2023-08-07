
package listaexercicios03.basicoxavancado;

import java.util.Scanner;


public class Excercicio30 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro retângulo:");
        int[] retangulo1 = lerVertices(scanner);

        System.out.println("Digite as coordenadas do segundo retângulo:");
        int[] retangulo2 = lerVertices(scanner);

        boolean interceptam = verificarInterseccao(retangulo1, retangulo2);

        if (interceptam) {
            System.out.println("Os retângulos se interceptam em algum lugar.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }

        scanner.close();
    }
    
    public static int[] lerVertices(Scanner scanner) {
        int[] vertices = new int[8];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a coordenada x do vértice " + (i + 1) + ": ");
            vertices[i * 2] = scanner.nextInt();

            System.out.print("Digite a coordenada y do vértice " + (i + 1) + ": ");
            vertices[i * 2 + 1] = scanner.nextInt();
        }

        return vertices;
    }
    
    public static boolean verificarInterseccao(int[] retangulo1, int[] retangulo2) {
        int maxX1 = Math.max(retangulo1[0], Math.max(retangulo1[2], Math.max(retangulo1[4], retangulo1[6])));
        int minX1 = Math.min(retangulo1[0], Math.min(retangulo1[2], Math.min(retangulo1[4], retangulo1[6])));
        int maxY1 = Math.max(retangulo1[1], Math.max(retangulo1[3], Math.max(retangulo1[5], retangulo1[7])));
        int minY1 = Math.min(retangulo1[1], Math.min(retangulo1[3], Math.min(retangulo1[5], retangulo1[7])));

        int maxX2 = Math.max(retangulo2[0], Math.max(retangulo2[2], Math.max(retangulo2[4], retangulo2[6])));
        int minX2 = Math.min(retangulo2[0], Math.min(retangulo2[2], Math.min(retangulo2[4], retangulo2[6])));
        int maxY2 = Math.max(retangulo2[1], Math.max(retangulo2[3], Math.max(retangulo2[5], retangulo2[7])));
        int minY2 = Math.min(retangulo2[1], Math.min(retangulo2[3], Math.min(retangulo2[5], retangulo2[7])));

        return (maxX1 >= minX2 && maxX2 >= minX1) && (maxY1 >= minY2 && maxY2 >= minY1);
    }
    
}
