
package gauss.seidel;

public class GaussSeidel {

    public static void main(String[] args) {
        double[][] matriz = {
            {3, 1, -1, 1},
            {2, 2, 4, 5},
            {1, 1, 10, -4}
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

        // Inicializar soluciones con ceros
        for (int i = 0; i < n; i++) {
            soluciones[i] = 0;
        }

        // Iterar hasta alcanzar el número máximo de iteraciones o converger
        do {
            // Copiar soluciones actuales en soluciones anteriores
            System.arraycopy(soluciones, 0, solucionesAnteriores, 0, n);

            // Calcular nuevas soluciones utilizando el método de Gauss-Seidel
            for (int i = 0; i < n; i++) {
                double suma = matriz[i][n];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= matriz[i][j] * soluciones[j];
                    }
                }
                soluciones[i] = suma / matriz[i][i];
            }

            // Calcular el error máximo
            error = 0;
            for (int i = 0; i < n; i++) {
                double diferencia = Math.abs(soluciones[i] - solucionesAnteriores[i]);
                if (diferencia > error) {
                    error = diferencia;
                }
            }

            // Incrementar el contador de iteraciones
            iteracion++;

        } while (iteracion < iteracionesMaximas && error > tolerancia);

        // Verificar convergencia
        if (error <= tolerancia) {
            return soluciones; // Retorna las soluciones encontradas
        } else {
            return null; // El sistema no converge
        }
    }
}
