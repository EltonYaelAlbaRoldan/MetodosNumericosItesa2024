package ejercicio5euler;

public class Ejercicio5Euler {

    // Función dy/dx = ln(x + 1)
    public static double f(double x) {
        return Math.log(x + 1);
    }
    
    // Solución exacta y = (x+1)ln(x+1) - x
    public static double solExac(double x) {
        return (x + 1) * Math.log(x + 1) - x;
    }
    
    public static void main(String[] args) {
        // Condición inicial
        double y0 = 0.0;
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
Función dy/dx = ln(x + 1)
Solución exacta y=(x+1)ln(x+1)−x
Desde x = 0 hasta x = 2 
Tamaño de paso = 0.2
Condición inicial en x = 0 es y = 0

Ouput
X	Y(Verdadero)	Y(Euler)
0.00	0.00000		0.00000
0.20	0.01879		0.00000
0.40	0.07106		0.03646
0.60	0.15201		0.10376
0.80	0.25802		0.19776
1.00	0.38629		0.31532
1.20	0.53461		0.45395
1.40	0.70112		0.61164
1.60	0.88433		0.78673
1.80	1.08293		0.97783
2.00	1.29584		1.18376
*/