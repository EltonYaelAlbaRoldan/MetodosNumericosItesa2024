package ejercicio2euler;

public class Ejercicio2Euler {

    // Función dy/dx = 2x + 1
    public static double f(double x) {
        return 2 * x + 1;
    }
    
    // Solución exacta y = x^2 + x + 1
    public static double solExac(double x) {
        return Math.pow(x, 2) + x + 1;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 1.0;
        double x0 = 0.0;
        double xf = 2.0;
        double deltaX = 0.2;
        
        // Número de pasos
        int steps = (int) ((xf - x0) / deltaX);
        
        // Almacenar valores de X y Y
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
            y[i + 1] = y[i] + deltaX * f(x[i]);
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
Función dy/dx = 2x+1
Solución exacta y=x^2+x+1
Desde x = 0 hasta x = 2 
Tamaño de paso = 0.2
Condición inicial en x = 0 es y = 1

Ouput
X	Y(Verdadero)	Y(Euler)
0.00	1.00000		1.00000
0.20	1.24000		1.20000
0.40	1.56000		1.48000
0.60	1.96000		1.84000
0.80	2.44000		2.28000
1.00	3.00000		2.80000
1.20	3.64000		3.40000
1.40	4.36000		4.08000
1.60	5.16000		4.84000
1.80	6.04000		5.68000
2.00	7.00000		6.60000
*/