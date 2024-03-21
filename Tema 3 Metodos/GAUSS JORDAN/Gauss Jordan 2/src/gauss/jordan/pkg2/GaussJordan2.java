
package gauss.jordan.pkg2;

public class GaussJordan2 {

    public static void main(String[] args) {
        double[][] matriz = {
            {2, 1, -1, 8, 5},
            {-3, -1, 2, -11, 6},
            {-2, 1, 2, -3, 10},
            {5, 6, 7, 8, 9}
        };

        gaussJordan(matriz);
        System.out.println("Soluciones:");
        System.out.println("x = " + matriz[0][4]);
        System.out.println("y = " + matriz[1][4]);
        System.out.println("z = " + matriz[2][4]);
        System.out.println("a = "+ matriz[3][4]);
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
