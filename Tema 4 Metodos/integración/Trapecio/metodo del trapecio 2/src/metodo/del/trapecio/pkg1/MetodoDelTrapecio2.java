
package metodo.del.trapecio.pkg1;

public class MetodoDelTrapecio2 {

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
        // Ejemplo de puntos x y y para una función seno
        int n = 100; // Número de puntos
        double[] x = new double[n + 1];
        double[] y = new double[n + 1];
        double h = 2 * Math.PI / n;

        // Calcular los puntos y para la función seno
        for (int i = 0; i <= n; i++) {
            x[i] = i * h;
            y[i] = Math.sin(x[i]);
        }

        // Calcular la integral definida usando el método del trapecio
        double integral = calcularIntegralTrapecio(x, y);

        // Imprimir la integral calculada
        System.out.println("La integral definida de la función seno es: " + integral);
    }
}
//La integral definida de la función seno es: 3.178880769727499E-16