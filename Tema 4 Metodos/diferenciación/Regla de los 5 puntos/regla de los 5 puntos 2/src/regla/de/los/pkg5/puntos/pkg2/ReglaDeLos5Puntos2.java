
package regla.de.los.pkg5.puntos.pkg2;

public class ReglaDeLos5Puntos2 {

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
        // Ejemplo de puntos x y y para una función seno
        double[] x = {0.0, Math.PI / 4, Math.PI / 2, 3 * Math.PI / 4, Math.PI}; // Puntos x
        double[] y = {0.0, Math.sqrt(2) / 2, 1.0, Math.sqrt(2) / 2, 0.0}; // Puntos y (seno)

        // Calcular todas las derivadas
        double[] derivadas = calcularDerivadas(x, y);

        // Imprimir todas las derivadas calculadas
        for (int i = 0; i < derivadas.length; i++) {
            System.out.println("La derivada en el punto " + x[i + 2] + " es: " + derivadas[i]);
        }
    }
}
//La derivada en el punto 1.5707963267948966 es: 0.0
