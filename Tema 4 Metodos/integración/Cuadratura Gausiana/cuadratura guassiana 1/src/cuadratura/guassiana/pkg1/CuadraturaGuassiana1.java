
package cuadratura.guassiana.pkg1;

public class CuadraturaGuassiana1 {

    // Método para calcular la integral definida usando cuadratura Gaussiana
    public static double calcularIntegralCuadraturaGaussiana(double[] x, double[] y) {
        if (x.length != y.length) {
            System.out.println("Los arrays de entrada deben tener la misma longitud.");
            return Double.NaN;
        }

        double integral = 0.0;
        double[] weights = {0.57735, 0.57735}; // Pesos para dos puntos
        double[] points = {-0.57735, 0.57735}; // Puntos para dos puntos

        // Calcular la integral usando cuadratura Gaussiana
        for (int i = 0; i < x.length - 1; i++) {
            double h = x[i + 1] - x[i];
            for (int j = 0; j < points.length; j++) {
                double xi = (x[i] + x[i + 1]) / 2.0 + (points[j] * h) / 2.0;
                integral += weights[j] * y[i] * h / 2.0;
            }
        }
        return integral;
    }

    public static void main(String[] args) {
        // Ejemplo de puntos x y y para una función cuadrática (f(x) = x^2)
        double[] x = {0.0, 1.0, 2.0, 3.0, 4.0}; // Puntos x
        double[] y = {0.0, 1.0, 4.0, 9.0, 16.0}; // Puntos y (x^2)

        // Calcular la integral definida usando cuadratura Gaussiana
        double integral = calcularIntegralCuadraturaGaussiana(x, y);

        // Imprimir la integral calculada
        System.out.println("La integral definida de la funcion es: " + integral);
    }
}
//La integral definida de la función es: 8.0829