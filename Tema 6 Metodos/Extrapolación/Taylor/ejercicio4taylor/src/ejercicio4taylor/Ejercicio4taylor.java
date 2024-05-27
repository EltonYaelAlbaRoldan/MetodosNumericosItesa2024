package ejercicio4taylor;

public class Ejercicio4taylor {

    // Función dy/dx = cos(x)
    public static double f(double x) {
        return Math.cos(x);
    }
    
    // Primera derivada de f(x)
    public static double fPrimera(double x) {
        return -Math.sin(x);
    }
    
    // Segunda derivada de f(x)
    public static double fSegunda(double x) {
        return -Math.cos(x);
    }
    
    // Tercera derivada de f(x)
    public static double fTercera(double x) {
        return Math.sin(x);
    }
    
    // Solución exacta y = sin(x) + 1
    public static double solExac(double x) {
        return Math.sin(x) + 1;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 1.0;
        double x0 = 0.0;
        double xf = Math.PI;
        double deltaX = 0.3;
        
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
        
        // Método de Taylor de tercer orden
        for (int i = 0; i < steps; i++) {
            x[i + 1] = x[i] + deltaX;
            
            // y(i+1) = y(i) + h*f(x(i)) + (h^2/2!)*f'(x(i)) + (h^3/3!)*f''(x(i))
            y[i + 1] = y[i] + deltaX * f(x[i])
                             + (Math.pow(deltaX, 2) / 2) * fPrimera(x[i])
                             + (Math.pow(deltaX, 3) / 6) * fSegunda(x[i])
                             + (Math.pow(deltaX, 4) / 24) * fTercera(x[i]);
            
            // Solución exacta
            exactY[i + 1] = solExac(x[i + 1]);
        }
        
        // Resultados
        System.out.println("X\tY(Verdadero)\tY(Taylor)");
        for (int i = 0; i <= steps; i++) {
            System.out.printf("%.2f\t%.5f\t\t%.5f\n", x[i], exactY[i], y[i]);
        }
    }
}
//Imput
/*
Función dy/dx = cos(x)
Solución exacta y = sin(x)+C
Desde x = 1 hasta x = π
Tamaño de paso = 0.3
Condición inicial en x = 0 es y = 1
*/

// Ouput
/*
X	Y(Verdadero)	Y(Taylor)
0.00	1.00000		1.00000
0.30	1.29552		1.29550
0.60	1.56464		1.56460
0.90	1.78333		1.78327
1.20	1.93204		1.93197
1.50	1.99749		1.99742
1.80	1.97385		1.97377
2.10	1.86321		1.86314
2.40	1.67546		1.67541
2.70	1.42738		1.42734
3.00	1.14112		1.14110
*/