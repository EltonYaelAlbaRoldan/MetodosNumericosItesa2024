
package gauss.jordan;

public class GaussJordan {
    
    public static void main(String[] args) {
        //Se define la Matriz
        double[][] matriz = {
            {2, 1, -1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        gaussJordan(matriz);
        // Imprime x, y, z
        System.out.println("Soluciones:");
        System.out.println("x1 = " + matriz[0][3]);
        System.out.println("x2 = " + matriz[1][3]);
        System.out.println("x3 = " + matriz[2][3]);
    }

    public static void gaussJordan(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            // Pivoteo parcial
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(matriz[j][i]) > Math.abs(matriz[maxRow][i])) {
                    maxRow = j;
                }
            }
            double[] temp = matriz[i];
            matriz[i] = matriz[maxRow];
            matriz[maxRow] = temp;

            // Hacer el pivote igual a 1
            double pivot = matriz[i][i];
            for (int j = i + 1; j <= n; j++) {
                matriz[i][j] /= pivot;
            }

            // Hacer ceros por debajo del pivote
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    double factor = matriz[j][i];
                    for (int k = i; k <= n; k++) {
                        matriz[j][k] -= factor * matriz[i][k];
                    }
                }
            }
        }
    }
}
