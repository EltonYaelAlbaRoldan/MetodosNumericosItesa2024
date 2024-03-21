
package gauss.seidel.pkg3;

public class GaussSeidel3 {

    public static void main(String[] args) {
        double[][] matriz = {
            {50, 1, -1, 1, 6, 40},
            {2, 40, 4, 5, 7, 35},
            {1, 1, 30, -4, 8, 15},
            {5, 18, 9, 20, 9, 9},
            {5, 18, 9, 20, 10, 13}
        };
        int iteracionesMaximas = 100;
        double tolerancia = 0.0001;

        double[] soluciones = gaussSeidel(matriz, iteracionesMaximas, tolerancia);
        
        if (soluciones != null) {
            System.out.println("Soluciones:");
            for (int i = 0; i < soluciones.length; i++) {
                System.out.println("x" + (i+1) + " = " + soluciones[i]);
            }
        } else {
            System.out.println("El sistema no converge.");
        }
    }

    public static double[] gaussSeidel(double[][] matriz, int iteracionesMaximas, double tolerancia) {
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
                        suma -= matriz[i][j] * soluciones[j];
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
