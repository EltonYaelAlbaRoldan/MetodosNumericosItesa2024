
package regla.de.los.pkg3.puntos;

public class ReglaDeLos3Puntos {

    public static double derivadaReglaTresPuntos(double[] x, double[] y, int punto) {
        // Asegurarse de que hay suficientes puntos para calcular la derivada
        if (x.length < 3 || y.length < 3 || punto < 1 || punto > x.length - 2) {
            System.out.println("No hay suficientes puntos o el punto seleccionado no está en el rango adecuado.");
            return Double.NaN; // Devolver NaN (Not a Number) para indicar un error
        }

        // Calcular el incremento h
        double h = x[1] - x[0];

        // Calcular la derivada usando la regla de los 3 puntos
        double derivada = (-y[punto + 2] + 4 * y[punto + 1] - 3 * y[punto]) / (2 * h);

        return derivada;
    }

    public static void main(String[] args) {
        // Ejemplo de puntos x y y
        double[] x = {0.0, 1.0, 2.0, 3.0, 4.0}; // Puntos x
        double[] y = {1.0, 2.0, 4.0, 8.0, 16.0}; // Puntos y

        // Calcular la derivada en el punto 2 (índice 2)
        int punto = 2;
        double derivada = derivadaReglaTresPuntos(x, y, punto);

        // Imprimir la derivada calculada
        System.out.println("La derivada en el punto " + x[punto] + " es: " + derivada);
    }  
}
//La derivada en el punto 2.0 es: 2.0
