package ejercicio3taylor;

public class Ejercicio3taylor {

    // Función dy/dx = sin(x)
    public static double f(double x) {
        return Math.sin(x);
    }
    
    // Primera derivada de f(x)
    public static double fPrimera(double x) {
        return Math.cos(x);
    }
    
    // Segunda derivada de f(x)
    public static double fSegunda(double x) {
        return -Math.sin(x);
    }
    
    // Tercera derivada de f(x)
    public static double fTercera(double x) {
        return -Math.cos(x);
    }
    
    // Solución exacta y = -cos(x) - 1
    public static double solExac(double x) {
        return -Math.cos(x) - 1;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = -1.0;
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
Función dy/dx = sin(x)
Solución exacta y = −cos(x)+C
Desde x = 1 hasta x = π
Tamaño de paso = 0.3
Condición inicial en x = 0 es y = -1
*/

// Ouput
/*
X	Y(Verdadero)	Y(Taylor)
0.00	-2.00000		-1.00000
0.30	-1.95534		-0.95534
0.60	-1.82534		-0.82534
0.90	-1.62161		-0.62163
1.20	-1.36236		-0.36239
1.50	-1.07074		-0.07079
1.80	-0.77280		0.22713
2.10	-0.49515		0.50475
2.40	-0.26261		0.73728
2.70	-0.09593		0.90395
3.00	-0.01001		0.98986
*/