package ejercicio.adicional;
import java.util.Scanner;

public class EjercicioAdicional {
    
    public static double f(double x) {
        return 2 * Math.sin(x) - Math.pow(x, 2) / 10;
    }
    
    public static double interpolacionCuadratica(double x0, double y0, double x1, double y1, double x2, double y2) {
        double a = y0 * (Math.pow(x1, 2) - Math.pow(x2, 2));
        a = a + y1 * (Math.pow(x2, 2) - Math.pow(x0, 2));
        a = a + y2 * (Math.pow(x0, 2) - Math.pow(x1, 2));
        double b = 2 * y0 * (x1 - x2) + 2 * y1 * (x2 - x0) + 2 * y2 * (x0 - x1);
        double y = a / b;
        return y;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
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
        
        scanner.close();
        
        double x3 = interpolacionCuadratica(x0, y0, x1, y1, x2, y2);
        double y3 = f(x3);
        System.out.println("x3 = " + x3);
        System.out.println("y3 = " + y3);
    }
}
