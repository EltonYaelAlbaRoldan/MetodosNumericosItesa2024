package ejercicio4runge;

public class Ejercicio4runge {

    // Función dy/dx = x^2 + sin(x)
    public static double f(double x) {
        return Math.pow(x, 2) + Math.sin(x);
    }
    
    // Solución exacta y = (x^3)/3 - cos(x) + 1
    public static double solExac(double x) {
        return (Math.pow(x, 3) / 3) - Math.cos(x) + 1;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 0.0;
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
Función dy/dx = x^2+sin(x)
Solución exacta y= ((x^3)/3)−cos(x)+C
Desde x = 0 hasta x = 2 
Tamaño de paso = 0.2
Condición inicial en x = 0 es y = 0
*/

//Ouput
/*
X	Y(Verdadero)	Y(Runge-Kutta)
0.00	0.00000		0.00000
0.20	0.02260		0.02260
0.40	0.10027		0.10027
0.60	0.24666		0.24666
0.80	0.47396		0.47396
1.00	0.79303		0.79303
1.20	1.21364		1.21364
1.40	1.74470		1.74470
1.60	2.39453		2.39453
1.80	3.17120		3.17120
2.00	4.08281		4.08281
*/