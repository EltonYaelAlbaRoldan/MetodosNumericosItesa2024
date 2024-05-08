
package regla.de.los.pkg5.puntos;

public class ReglaDeLos5Puntos {

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
        // Ejemplo de puntos x y y para una función polinómica (f(x) = x^3)
        double[] x = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0}; // Puntos x
        double[] y = {0.0, 1.0, 8.0, 27.0, 64.0, 125.0}; // Puntos y (x^3)

        // Calcular todas las derivadas
        double[] derivadas = calcularDerivadas(x, y);

        // Imprimir todas las derivadas calculadas
        for (int i = 0; i < derivadas.length; i++) {
            System.out.println("La derivada en el punto " + x[i + 2] + " es: " + derivadas[i]);
        }
    }
}

//La derivada en el punto 2.0 es: 12.0
//La derivada en el punto 3.0 es: 27.0