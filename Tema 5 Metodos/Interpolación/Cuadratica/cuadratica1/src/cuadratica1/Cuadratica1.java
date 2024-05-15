
package cuadratica1;

import java.util.Scanner;

public class Cuadratica1 {

    // Método para realizar interpolación cuadrática
    public static double interpolate(double x0, double y0, double x1, double y1, double x2, double y2, double x) {
        // Cálculo de los coeficientes del polinomio cuadrático
        double a = ((y2 - y0) / ((x2 - x0) * (x2 - x1))) - ((y1 - y0) / ((x1 - x0) * (x2 - x1)));
        double b = ((y1 - y0) / (x1 - x0)) - a * (x0 + x1);
        double c = y0 - a * x0 * x0 - b * x0;
        
        // Evaluación del polinomio cuadrático en el punto x
        double y = a * x * x + b * x + c;
        
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario los puntos
        System.out.println("Ingrese los puntos conocidos (x0, y0), (x1, y1) y (x2, y2):");
        System.out.print("x0: ");
        double x0 = scanner.nextDouble();
        System.out.print("y0: ");
        double y0 = scanner.nextDouble();
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        // Punto para el que se desea interpolar
        System.out.print("Ingrese el valor de x para el que desea interpolar: ");
        double x = scanner.nextDouble();
        
        scanner.close();
        
        // Interpolación cuadrática
        double interpolatedY = interpolate(x0, y0, x1, y1, x2, y2, x);
        
        // Resultado
        System.out.println("El valor interpolado de y para x=" + x + " es: " + interpolatedY);
    }
}

/*
run:
Ingrese los puntos conocidos (x0, y0), (x1, y1) y (x2, y2):
x0: 7
y0: 14
x1: 10
y1: 21
x2: 13
y2: 27
Ingrese el valor de x para el que desea interpolar: 9
El valor interpolado de y para x=9.0 es: 18.77777777777778
*/

