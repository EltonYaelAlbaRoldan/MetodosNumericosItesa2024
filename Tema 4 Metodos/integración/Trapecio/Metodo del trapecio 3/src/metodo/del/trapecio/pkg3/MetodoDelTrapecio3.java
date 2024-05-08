
package metodo.del.trapecio.pkg3;

public class MetodoDelTrapecio3 {

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
        // Ejemplo de puntos x y y para una función exponencial (f(x) = e^x)
        int n = 100; // Número de puntos
        double[] x = new double[n + 1];
        double[] y = new double[n + 1];
        double h = 1.0 / n;

        // Calcular los puntos y para la función exponencial
        for (int i = 0; i <= n; i++) {
            x[i] = i * h;
            y[i] = Math.exp(x[i]);
        }

        // Calcular la integral definida usando el método del trapecio
        double integral = calcularIntegralTrapecio(x, y);

        // Imprimir la integral calculada
        System.out.println("La integral definida de la función exponencial es: " + integral);
    }
}
//La integral definida de la función exponencial es: 1.7182961474504177