
package cuadratura.gausiana.pkg2;

public class CuadraturaGausiana2 {

    // Función para evaluar la función exponencial en un punto x
    public static double funcionExponencial(double x) {
        return Math.exp(-x);
    }

    // Método para calcular la integral definida usando cuadratura Gaussiana
    public static double calcularIntegralCuadraturaGaussiana(int n) {
        double integral = 0.0;

        // Puntos y pesos para cuadratura Gaussiana con n puntos
        double[] x = {0.1488743389816312, 0.4333953941292472, 0.6794095682990244, 
                      0.8650633666889845, 0.9739065285171717};
        double[] w = {0.2955242247147529, 0.2692667193099963, 0.2190863625159821, 
                      0.1494513491505806, 0.0666713443086881};

        // Calcular la integral usando cuadratura Gaussiana
        for (int i = 0; i < n; i++) {
            integral += w[i] * funcionExponencial(x[i]);
        }
        return integral;
    }

    public static void main(String[] args) {
        // Número de puntos para cuadratura Gaussiana
        int n = 5;

        // Calcular la integral definida usando cuadratura Gaussiana con n puntos
        double integral = calcularIntegralCuadraturaGaussiana(n);

        // Imprimir la integral calculada
        System.out.println("La integral definida de la funcion exponencial es: " + integral);
    }
}
//La integral definida de la función exponencial es: 0.6283698586790112