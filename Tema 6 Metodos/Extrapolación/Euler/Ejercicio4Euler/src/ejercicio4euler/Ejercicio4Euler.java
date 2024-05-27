package ejercicio4euler;

public class Ejercicio4Euler {

    // Función dy/dx = e^x
    public static double f(double x) {
        return Math.exp(x);
    }
    
    // Solución exacta y = e^x + 1
    public static double solExac(double x) {
        return Math.exp(x) + 1;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 2.0;
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
Función dy/dx = e^x
Solución exacta y=e^x+1
Desde x = 0 hasta x = 2 
Tamaño de paso = 0.2
Condición inicial en x = 0 es y = 2

Ouput
X	Y(Verdadero)	Y(Euler)
0.00	2.00000		2.00000
0.20	2.22140		2.20000
0.40	2.49182		2.44428
0.60	2.82212		2.74265
0.80	3.22554		3.10707
1.00	3.71828		3.55218
1.20	4.32012		4.09583
1.40	5.05520		4.75986
1.60	5.95303		5.57090
1.80	7.04965		6.56150
2.00	8.38906		7.77143
*/