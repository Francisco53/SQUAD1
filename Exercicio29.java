import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do vértice superior esquerdo do retângulo:");
        System.out.print("X: ");
        int x1 = scanner.nextInt();
        System.out.print("Y: ");
        int y1 = scanner.nextInt();

        System.out.println("Digite as coordenadas do vértice inferior direito do retângulo:");
        System.out.print("X: ");
        int x2 = scanner.nextInt();
        System.out.print("Y: ");
        int y2 = scanner.nextInt();

        int largura = Math.abs(x2 - x1);
        int altura = Math.abs(y2 - y1);

        if (largura == 0 && altura == 0) {
            System.out.println("É um ponto.");
        } else if (largura == 0) {
            System.out.println("É uma reta vertical.");
        } else if (altura == 0) {
            System.out.println("É uma reta horizontal.");
        } else {
            System.out.println("É um retângulo.");
            int area = largura * altura;
            System.out.println("A área do retângulo é: " + area);

            System.out.println("Digite as coordenadas de um ponto para verificar sua posição em relação ao retângulo:");
            System.out.print("X: ");
            int xPonto = scanner.nextInt();
            System.out.print("Y: ");
            int yPonto = scanner.nextInt();

            if (xPonto < x1 && yPonto > y2) {
                System.out.println("O ponto está acima e à esquerda do retângulo.");
            } else if (xPonto < x1 && yPonto < y1) {
                System.out.println("O ponto está embaixo e à esquerda do retângulo.");
            } else if (xPonto > x2 && yPonto > y2) {
                System.out.println("O ponto está acima e à direita do retângulo.");
            } else if (xPonto > x2 && yPonto < y1) {
                System.out.println("O ponto está embaixo e à direita do retângulo.");
            } else if (xPonto < x1) {
                System.out.println("O ponto está à esquerda do retângulo.");
            } else if (xPonto > x2) {
                System.out.println("O ponto está à direita do retângulo.");
            } else if (yPonto > y2) {
                System.out.println("O ponto está acima do retângulo.");
            } else if (yPonto < y1) {
                System.out.println("O ponto está embaixo do retângulo.");
            } else {
                System.out.println("O ponto está dentro do retângulo.");
            }
        }

        scanner.close();
    }
}