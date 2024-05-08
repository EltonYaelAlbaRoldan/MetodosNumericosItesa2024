
package simpson.pkg3;

public class Simpson3 {

    // Método para calcular la integral definida usando el método de Simpson
    public static double calcularIntegralSimpson(double[] x, double[] y) {
        if (x.length != y.length) {
            System.out.println("Los arrays de entrada deben tener la misma longitud.");
            return Double.NaN;
        }

        double integral = 0.0;
        double h = x[1] - x[0];

        // Calcular la integral usando la fórmula de Simpson
        for (int i = 0; i < x.length - 2; i += 2) {
            integral += h / 3.0 * (y[i] + 4 * y[i + 1] + y[i + 2]);
        }
        return integral;
    }

    public static void main(String[] args) {
        // Ejemplo de puntos x y y para una función cúbica (f(x) = x^3)
        double[] x = {0.0, 1.0, 2.0, 3.0, 4.0}; // Puntos x
        double[] y = {0.0, 1.0, 8.0, 27.0, 64.0}; // Puntos y (x^3)

        // Calcular la integral definida usando el método de Simpson
        double integral = calcularIntegralSimpson(x, y);

        // Imprimir la integral calculada
        System.out.println("La integral definida de la funcion cubica es: " + integral);
    }
}
//La integral definida de la función cúbica es: 64.0