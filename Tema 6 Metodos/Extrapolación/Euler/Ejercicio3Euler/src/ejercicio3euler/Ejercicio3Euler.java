package ejercicio3euler;

public class Ejercicio3Euler {

    // Función dy/dx = sin(x)
    public static double f(double x) {
        return Math.sin(x);
    }
    
    // Solución exacta y = -cos(x) + 2
    public static double solExac(double x) {
        return -Math.cos(x) + 2;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 1.0;
        double x0 = 0.0;
        double xf = Math.PI;
        double deltaX = 0.1;
        
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
Función dy/dx = sin(x)
Solución exacta y=−cos(x)+2
Desde x = 0 hasta x = π 
Tamaño de paso = 0.1
Condición inicial en x = 0 es y = 1

Ouput
X	Y(Verdadero)	Y(Euler)
0.00	1.00000		1.00000
0.10	1.00500		1.00000
0.20	1.01993		1.00998
0.30	1.04466		1.02985
0.40	1.07894		1.05940
0.50	1.12242		1.09834
0.60	1.17466		1.14629
0.70	1.23516		1.20275
0.80	1.30329		1.26717
0.90	1.37839		1.33891
1.00	1.45970		1.41724
1.10	1.54640		1.50139
1.20	1.63764		1.59051
1.30	1.73250		1.68371
1.40	1.83003		1.78007
1.50	1.92926		1.87861
1.60	2.02920		1.97836
1.70	2.12884		2.07832
1.80	2.22720		2.17749
1.90	2.32329		2.27487
2.00	2.41615		2.36950
2.10	2.50485		2.46043
2.20	2.58850		2.54675
2.30	2.66628		2.62760
2.40	2.73739		2.70217
2.50	2.80114		2.76972
2.60	2.85689		2.82957
2.70	2.90407		2.88112
2.80	2.94222		2.92385
2.90	2.97096		2.95735
3.00	2.98999		2.98128
3.10	2.99914		2.99539
*/