import java.util.Scanner;

public class MatrizRecursiva {

    public static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        int valor = 100;  // Início em 100

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor++;
            }

        }

        return matriz;
    }

    public static void exibirElementosMatriz(int[][] matriz, int linha, int coluna) {
        if (linha >= matriz.length) return;

        System.out.print(matriz[linha][coluna] + " ");

        if (coluna < matriz[0].length - 1) {
            exibirElementosMatriz(matriz, linha, coluna + 1);
        } else {
            System.out.println();
            exibirElementosMatriz(matriz, linha + 1, 0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = criarMatriz(linhas, colunas);

        // Exibindo a quantidade de linhas e colunas da matriz
        System.out.println("A matriz tem " + matriz.length + " linhas e " + matriz[0].length + " colunas.");

        System.out.println("Elementos da matriz:");
        exibirElementosMatriz(matriz, 0, 0);

        scanner.close();
    }
}
