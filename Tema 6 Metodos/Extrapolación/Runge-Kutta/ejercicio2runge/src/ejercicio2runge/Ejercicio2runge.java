package ejercicio2runge;

public class Ejercicio2runge {

    // Función dy/dx = x^2 - x + 1
    public static double f(double x) {
        return Math.pow(x, 2) - x + 1;
    }
    
    // Solución exacta y = (x^3)/3 - (x^2)/2 + x + 1
    public static double solExac(double x) {
        return (Math.pow(x, 3) / 3) - (Math.pow(x, 2) / 2) + x + 1;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 1.0;
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
        
        // Método de Runge-Kutta de cuarto orden
        for (int i = 0; i < steps; i++) {
            x[i + 1] = x[i] + deltaX;
            
            // Coeficientes k1, k2, k3, k4
            double k1 = deltaX * f(x[i]);
            double k2 = deltaX * f(x[i] + deltaX / 2.0);
            double k3 = deltaX * f(x[i] + deltaX / 2.0);
            double k4 = deltaX * f(x[i] + deltaX);
            
            // y(i+1) = y(i) + (1/6)*(k1 + 2*k2 + 2*k3 + k4)
            y[i + 1] = y[i] + (1.0 / 6.0) * (k1 + 2.0 * k2 + 2.0 * k3 + k4);
            
            // Solución exacta
            exactY[i + 1] = solExac(x[i + 1]);
        }
        
        // Resultados
        System.out.println("X\tY(Verdadero)\tY(Runge-Kutta)");
        for (int i = 0; i <= steps; i++) {
            System.out.printf("%.2f\t%.5f\t\t%.5f\n", x[i], exactY[i], y[i]);
        }
    }
}
//Imput
/*
Función dy/dx = 2x+1
Solución exacta y=x^2−x+1
Desde x = 0 hasta x = 2 
Tamaño de paso = 0.2
Condición inicial en x = 0 es y = 1
*/

//Ouput
/*
X	Y(Verdadero)	Y(Runge-Kutta)
0.00	1.00000		1.00000
0.20	1.18267		1.18267
0.40	1.34133		1.34133
0.60	1.49200		1.49200
0.80	1.65067		1.65067
1.00	1.83333		1.83333
1.20	2.05600		2.05600
1.40	2.33467		2.33467
1.60	2.68533		2.68533
1.80	3.12400		3.12400
2.00	3.66667		3.66667
*/
