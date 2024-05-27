package ejercicio2taylor;

public class Ejercicio2Taylor {

    // Función dy/dx = 2x^2 - 3x + 1
    public static double f(double x) {
        return 2 * Math.pow(x, 2) - 3 * x + 1;
    }
    
    // Primera derivada de f(x)
    public static double fPrimera(double x) {
        return 4 * x - 3;
    }
    
    // Segunda derivada de f(x)
    public static double fSegunda(double x) {
        return 4;
    }
    
    // Tercera derivada de f(x)
    public static double fTercera(double x) {
        return 0;
    }
    
    // Solución exacta y = (2x^3)/3 - (3x^2)/2 + x
    public static double solExac(double x) {
        return (2 * Math.pow(x, 3) / 3) - (3 * Math.pow(x, 2) / 2) + x;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 0.0;
        double x0 = 1.0;
        double xf = 3.0;
        double deltaX = 0.5;
        
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
Función dy/dx = 2x^2-3x+1
Solución exacta y = ((2x^3)/3)-((3x^2)/2)+x+c
Desde x = 1 hasta x = 3
Tamaño de paso = 0.5
Condición inicial en x = 1 es y = 0
*/

// Ouput
/*
X	Y(Verdadero)	Y(Taylor)
1.00	0.16667		0.00000
1.50	0.37500		0.20833
2.00	1.33333		1.16667
2.50	3.54167		3.37500
3.00	7.50000		7.33333
*/