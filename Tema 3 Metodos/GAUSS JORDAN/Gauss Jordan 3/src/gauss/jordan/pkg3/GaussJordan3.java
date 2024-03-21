
package gauss.jordan.pkg3;

public class GaussJordan3 {

    public static void main(String[] args) {
        double[][] matriz = {
            {2, 1, -1, 8, 5, 0.25},
            {-3, -1, 2, -11, 6, -0.15},
            {-2, 1, 2, -3, 10, -21},
            {5, 6, 7, 8, 9, 10},
            {0.5, 0.75, -0.18, -2.3, 12, 0.33}
        };

        gaussJordan(matriz);
        System.out.println("Soluciones:");
        System.out.println("x1 = " + matriz[0][5]);
        System.out.println("x2 = " + matriz[1][5]);
        System.out.println("x3 = " + matriz[2][5]);
        System.out.println("x4 = "+ matriz[3][5]);
        System.out.println("x5 = "+ matriz[4][5]);
    }

    public static void gaussJordan(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(matriz[j][i]) > Math.abs(matriz[maxRow][i])) {
                    maxRow = j;
                }
            }
            double[] temp = matriz[i];
            matriz[i] = matriz[maxRow];
            matriz[maxRow] = temp;

            double pivot = matriz[i][i];
            for (int j = i + 1; j <= n; j++) {
                matriz[i][j] /= pivot;
            }

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
