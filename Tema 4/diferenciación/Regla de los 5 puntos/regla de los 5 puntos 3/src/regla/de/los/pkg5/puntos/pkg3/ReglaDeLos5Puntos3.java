
package regla.de.los.pkg5.puntos.pkg3;

public class ReglaDeLos5Puntos3 {

    // Método para calcular todas las derivadas usando la regla de los 5 puntos
    public static double[] calcularDerivadas(double[] x, double[] y) {
        if (x.length < 5 || y.length < 5) {
            System.out.println("No hay suficientes puntos.");
            return null;
        }

        double[] derivadas = new double[x.length - 4];
        double h = x[1] - x[0];

        for (int i = 2; i < x.length - 2; i++) {
            derivadas[i - 2] = (-y[i + 2] + 8 * y[i + 1] - 8 * y[i - 1] + y[i - 2]) / (12 * h);
        }

        return derivadas;
    }

    public static void main(String[] args) {
        // Ejemplo de puntos x y y para una función logarítmica (ln(x))
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0}; // Puntos x
        double[] y = {0.0, Math.log(2), Math.log(3), Math.log(4), Math.log(5), Math.log(6)}; // Puntos y (ln(x))

        // Calcular todas las derivadas
        double[] derivadas = calcularDerivadas(x, y);

        // Imprimir todas las derivadas calculadas
        for (int i = 0; i < derivadas.length; i++) {
            System.out.println("La derivada en el punto " + x[i + 2] + " es: " + derivadas[i]);
        }
    }
}

//La derivada en el punto 3.0 es: 0.3279782943371219
//La derivada en el punto 4.0 es: 0.2489993917883179