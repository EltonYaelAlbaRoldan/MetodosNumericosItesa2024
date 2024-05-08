
package metodo.del.trapecio;

public class MetodoDelTrapecio {

    // Método para calcular la integral definida usando el método del trapecio
    public static double calcularIntegralTrapecio(double[] x, double[] y) {
        if (x.length != y.length) {
            System.out.println("Los arrays de entrada deben tener la misma longitud.");
            return Double.NaN;
        }

        double integral = 0.0;
        for (int i = 0; i < x.length - 1; i++) {
            integral += (y[i] + y[i + 1]) * (x[i + 1] - x[i]) / 2.0;
        }
        return integral;
    }

    public static void main(String[] args) {
        // Ejemplo de puntos x y y para una función cuadrática (f(x) = x^2)
        double[] x = {0.0, 1.0, 2.0, 3.0, 4.0}; // Puntos x
        double[] y = {0.0, 1.0, 4.0, 9.0, 16.0}; // Puntos y (x^2)

        // Calcular la integral definida usando el método del trapecio
        double integral = calcularIntegralTrapecio(x, y);

        // Imprimir la integral calculada
        System.out.println("La integral definida de la función es: " + integral);
    }
}
//La integral definida de la funci�n es: 22.0