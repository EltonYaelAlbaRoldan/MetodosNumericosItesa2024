package ejercicio1taylor;

public class Ejercicio1taylor {

    // Función dy/dx = x^3 - 3x^2 + 3x - 1
    public static double f(double x) {
        return Math.pow(x, 3) - 3 * Math.pow(x, 2) + 3 * x - 1;
    }
    
    // Primera derivada de f(x)
    public static double fPrimera(double x) {
        return 3 * Math.pow(x, 2) - 6 * x + 3;
    }
    
    // Segunda derivada de f(x)
    public static double fSegunda(double x) {
        return 6 * x - 6;
    }
    
    // Tercera derivada de f(x)
    public static double fTercera(double x) {
        return 6;
    }
    
    // Solución exacta y = (x^4)/4 - x^3 + (3x^2)/2 - x + 1
    public static double solExac(double x) {
        return (Math.pow(x, 4) / 4) - Math.pow(x, 3) + (3 * Math.pow(x, 2) / 2) - x + 1;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 1.0;
        double x0 = 0.0;
        double xf = 2.0;
        double deltaX = 0.4;
        
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
Función dy/dx = x^3-(3x^2)+3x+1
Solución exacta y = ((x^4)/4)(x^3)+((3x^2)/2)-x+c
Desde x = 0 hasta x = 2
Tamaño de paso = 0.4
Condición inicial en x = 0 es y = 1
*/

// Ouput
/*
X	Y(Verdadero)	Y(Taylor)
0.00	1.00000		1.00000
0.40	0.78240		0.78240
0.80	0.75040		0.75040
1.20	0.75040		0.75040
1.60	0.78240		0.78240
2.00	1.00000		1.00000
*/