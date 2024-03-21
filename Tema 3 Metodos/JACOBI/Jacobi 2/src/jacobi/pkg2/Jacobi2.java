
package jacobi.pkg2;

public class Jacobi2 {

    public static void main(String[] args) {
        double[][] matriz = {
            {10, 2, -1, 3, 27},
            {1, 5, 1, -1, 9},
            {2, 3, 10, 1, 22},
            {1, -1, 3, 10, 15}
        };
        int iteracionesMaximas = 100;
        double tolerancia = 0.0001;

        double[] soluciones = jacobi(matriz, iteracionesMaximas, tolerancia);

        if (soluciones != null) {
            System.out.println("Soluciones:");
            for (int i = 0; i < soluciones.length; i++) {
                System.out.println("x" + (i + 1) + " = " + soluciones[i]);
            }
        } else {
            System.out.println("El sistema no converge.");
        }
    }

    public static double[] jacobi(double[][] matriz, int iteracionesMaximas, double tolerancia) {
        int n = matriz.length;
        double[] soluciones = new double[n];
        double[] solucionesAnteriores = new double[n];
        int iteracion = 0;
        double error = 0;

        for (int i = 0; i < n; i++) {
            soluciones[i] = 0;
        }

        do {
            System.arraycopy(soluciones, 0, solucionesAnteriores, 0, n);

            for (int i = 0; i < n; i++) {
                double suma = matriz[i][n];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= matriz[i][j] * solucionesAnteriores[j];
                    }
                }
                soluciones[i] = suma / matriz[i][i];
            }

            error = 0;
            for (int i = 0; i < n; i++) {
                double diferencia = Math.abs(soluciones[i] - solucionesAnteriores[i]);
                if (diferencia > error) {
                    error = diferencia;
                }
            }

            iteracion++;

        } while (iteracion < iteracionesMaximas && error > tolerancia);

        if (error <= tolerancia) {
            return soluciones;
        } else {
            return null;
        }
    }  
}
