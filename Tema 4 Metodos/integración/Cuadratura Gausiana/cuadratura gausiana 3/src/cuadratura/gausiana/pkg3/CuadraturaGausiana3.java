
package cuadratura.gausiana.pkg3;

public class CuadraturaGausiana3 {

    // Función para evaluar la función seno en un punto x
    public static double funcionSeno(double x) {
        return Math.sin(x);
    }

    // Método para calcular la integral definida usando cuadratura Gaussiana
    public static double calcularIntegralCuadraturaGaussiana(int n) {
        double integral = 0.0;

        // Puntos y pesos para cuadratura Gaussiana con n puntos
        double[] x = {0.0, 0.5384693101056831, -0.5384693101056831, 
                      0.9061798459386640, -0.9061798459386641};
        double[] w = {0.5688888888888889, 0.4786286704993665, 0.4786286704993665, 
                      0.2369268850561891, 0.2369268850561891};

        // Calcular la integral usando cuadratura Gaussiana
        for (int i = 0; i < n; i++) {
            integral += w[i] * funcionSeno(x[i]);
        }
        return integral;
    }

    public static void main(String[] args) {
        // Número de puntos para cuadratura Gaussiana
        int n = 5;

        // Calcular la integral definida usando cuadratura Gaussiana con n puntos
        double integral = calcularIntegralCuadraturaGaussiana(n);

        // Imprimir la integral calculada
        System.out.println("La integral definida de la función seno es: " + integral);
    }
}
//La integral definida de la función seno es: 0.0