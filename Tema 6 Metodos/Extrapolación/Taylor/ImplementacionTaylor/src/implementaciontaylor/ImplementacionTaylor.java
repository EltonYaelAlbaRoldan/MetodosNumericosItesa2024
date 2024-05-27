package implementaciontaylor;

public class ImplementacionTaylor {

    //Función dy/dx = -(2x^3) + (12x^2) - 20x + 8.5
    public static double f(double x) {
        return -(2 * Math.pow(x, 3)) + (12 * Math.pow(x, 2)) - 20 * x + 8.5;
    }

    //Primera derivada de f(x)
    public static double fPrimera(double x) {
        return -(6 * Math.pow(x, 2)) + (24 * x) - 20;
    }

    //Segunda derivada de f(x)
    public static double fSegunda(double x) {
        return -(12 * x) + 24;
    }

    //Tercera derivada de f(x)
    public static double fTercera(double x) {
        return -12;
    }

    //Solución exacta
    public static double solExac(double x) {
        return -0.5 * Math.pow(x, 4) + 4 * Math.pow(x, 3) - 10 * Math.pow(x, 2) + 8.5 * x + 1;
    }

    public static void main(String[] args) {
        //Condición inicial
        double y0 = 1.0;
        double x0 = 0.0;
        double xf = 4.0;
        double deltaX = 0.5;
        // Número de pasos(iteraciones)
        int steps = (int) ((xf - x0) / deltaX);
        //Almacenar los valores de X y Y de cada iteración
        double[] x = new double[steps + 1];
        double[] y = new double[steps + 1];
        double[] exactY = new double[steps + 1];
        //Condiciones iniciales
        x[0] = x0;
        y[0] = y0;
        exactY[0] = solExac(x0);
        //Método de Taylor de tercer orden
        for (int i = 0; i < steps; i++) {
            x[i + 1] = x[i] + deltaX;
            
            //y(i+1) = y(i) + h*f(x(i)) + (h^2/2!)*f'(x(i)) + (h^3/3!)*f''(x(i))
            y[i + 1] = y[i] + deltaX * f(x[i])
                             + (Math.pow(deltaX, 2) / 2) * fPrimera(x[i])
                             + (Math.pow(deltaX, 3) / 6) * fSegunda(x[i])
                             + (Math.pow(deltaX, 4) / 24) * fTercera(x[i]);
            
            //y = –0.5x^4 + 4x^3 – 10x^2 + 8.5x + 1
            exactY[i + 1] = solExac(x[i + 1]);
        }
        //Resultados
        System.out.println("X\tY(Verdadero)\tY(Taylor)");
        for (int i = 0; i <= steps; i++) {
            System.out.printf("%.2f\t%.5f\t\t%.5f\n", x[i], exactY[i], y[i]);
        }
    }
}
//Imput
/*
Función dy/dx = -(2x^3) + (12x^2) - 20x + 8.5
Solución exacta y = –0.5x^4 + 4x^3 – 10x^2 + 8.5x + 1
Desde x = 0 hasta x = 4
Tamaño de paso = 0.5
Condición inicial en x = 0 es y = 1
*/

// Ouput
/*
X	Y(Verdadero)	Y(Taylor)
0.00	1.00000		1.00000
0.50	3.21875		3.21875
1.00	3.00000		3.00000
1.50	2.21875		2.21875
2.00	2.00000		2.00000
2.50	2.71875		2.71875
3.00	4.00000		4.00000
3.50	4.71875		4.71875
4.00	3.00000		3.00000
*/