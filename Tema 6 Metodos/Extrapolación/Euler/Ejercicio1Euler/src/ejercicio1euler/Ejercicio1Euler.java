package ejercicio1euler;

public class Ejercicio1Euler {

    // Nueva función dy/dx = 3x^2 - 2x + 1
    public static double f(double x) {
        return 3 * Math.pow(x, 2) - 2 * x + 1;
    }
    
    // Nueva solución exacta y = x^3 - x^2 + x + C (para este ejemplo, asumo C=1)
    public static double solExac(double x) {
        return Math.pow(x, 3) - Math.pow(x, 2) + x + 1;
    }
    
    public static void main(String[] args) {
        // Nueva condición inicial
        double y0 = 1.0; // Este valor debe coincidir con la solución +exacta en x0 si C=1
        double x0 = 0.0;
        double xf = 2.0;
        double deltaX = 0.2;
        
        // Número de pasos (iteraciones)
        int steps = (int) ((xf - x0) / deltaX);
        
        // Almacenar los valores de X y Y de cada iteración
        double[] x = new double[steps + 1];
        double[] y = new double[steps + 1];
        double[] exactY = new double[steps + 1];
        
        // Condiciones iniciales
        x[0] = x0;
        y[0] = y0;
        exactY[0] = solExac(x0);
        
        // Método de Euler
        for (int i = 0; i < steps; i++) {
            x[i + 1] = x[i] + deltaX;
            
            // y(i+1) = y(i) + f(x(i)) * h
            y[i + 1] = y[i] + deltaX * f(x[i]);
            
            // Solución exacta para comparación
            exactY[i + 1] = solExac(x[i + 1]);
        }
        
        // Resultados
        System.out.println("X\tY(Verdadero)\tY(Euler)");
        for (int i = 0; i <= steps; i++) {
            System.out.printf("%.2f\t%.5f\t\t%.5f\n", x[i], exactY[i], y[i]);
        }
    }
}
/*
Imput
Función dy/dx = 3x^2 - 2x + 1
Solución exacta y = x^3 - x^2 + x + C (para este ejemplo, asumo C=1)
Desde x = 0 hasta x = 2 
Tamaño de paso = 0.2
Condición inicial en x = 0 es y = 1

Ouput
X	Y(Verdadero)	Y(Euler)
0.00	1.00000		1.00000
0.20	1.16800		1.20000
0.40	1.30400		1.34400
0.60	1.45600		1.48000
0.80	1.67200		1.65600
1.00	2.00000		1.92000
1.20	2.48800		2.32000
1.40	3.18400		2.90400
1.60	4.13600		3.72000
1.80	5.39200		4.81600
*/