package ejercicio5runge;

public class Ejercicio5runge {

    // Función dy/dx = cos(x) - x
    public static double f(double x) {
        return Math.cos(x) - x;
    }
    
    // Solución exacta y = sin(x) - (x^2)/2 + 1
    public static double solExac(double x) {
        return Math.sin(x) - (Math.pow(x, 2) / 2) + 1;
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
Función dy/dx = cos(x)−x
Solución exacta y= sin(x)-((x^2)/2)+C
Desde x = 0 hasta x = 2 
Tamaño de paso = 0.2
Condición inicial en x = 0 es y = 0
*/

//Ouput
/*
X	Y(Verdadero)	Y(Runge-Kutta)
0.00	1.00000		0.00000
0.20	1.17867		0.17867
0.40	1.30942		0.30942
0.60	1.38464		0.38464
0.80	1.39736		0.39736
1.00	1.34147		0.34147
1.20	1.21204		0.21204
1.40	1.00545		0.00545
1.60	0.71957		-0.28043
1.80	0.35385		-0.64615
2.00	-0.09070	-1.09070
*/