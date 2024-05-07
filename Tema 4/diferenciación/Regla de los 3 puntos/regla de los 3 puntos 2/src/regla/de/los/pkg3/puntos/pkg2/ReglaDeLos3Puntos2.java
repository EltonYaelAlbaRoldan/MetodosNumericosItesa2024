
package regla.de.los.pkg3.puntos.pkg2;

public class ReglaDeLos3Puntos2 {

    // Método para calcular todas las derivadas usando la regla de los 3 puntos
    public static double[] calcularDerivadas(double[] x, double[] y) {
        if (x.length < 3 || y.length < 3) {
            System.out.println("No hay suficientes puntos.");
            return null;
        }

        double[] derivadas = new double[x.length - 2];
        double h = x[1] - x[0];

        for (int i = 1; i < x.length - 1; i++) {
            derivadas[i - 1] = (-y[i + 1] + 4 * y[i] - 3 * y[i - 1]) / (2 * h);
        }

        return derivadas;
    }

    public static void main(String[] args) {
        // Ejemplo de puntos x y y para una función polinómica (f(x) = x^2)
        double[] x = {0.0, 1.0, 2.0, 3.0, 4.0}; // Puntos x
        double[] y = {0.0, 1.0, 4.0, 9.0, 16.0}; // Puntos y (x^2)

        // Calcular todas las derivadas
        double[] derivadas = calcularDerivadas(x, y);

        // Imprimir todas las derivadas calculadas
        for (int i = 0; i < derivadas.length; i++) {
            System.out.println("La derivada en el punto " + x[i + 1] + " es: " + derivadas[i]);
        }
    } 
}
//La derivada en el punto 5.0 es: 5.0
