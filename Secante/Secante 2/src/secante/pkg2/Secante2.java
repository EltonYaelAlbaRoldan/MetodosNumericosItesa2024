
package secante.pkg2;

public class Secante2 {
    
    public static double funcion(double x) {
        return -2.5*Math.pow(x, 3) +17* Math.pow(x, 2) - 22*x -11;
    }

    public static double secante(double x0, double x1, double tol, int maxIter) {
        double xn = x0;
        double xn_1 = x1;
        
        for (int i = 0; i < maxIter; i++) {
            double fxn = funcion(xn);
            double fxn_1 = funcion(xn_1);
            double xn1 = xn - (fxn * (xn - xn_1)) / (fxn - fxn_1);
            
            if (Math.abs(funcion(xn1)) < tol) {
                return xn1;
            }
            
            xn_1 = xn;
            xn = xn1;
        }
        
        return Double.NaN;
    }

    public static void main(String[] args) {
        double x0 = -1;
        double x1 = 0;
        double tol = 0.0001;
        int maxIter = 1000;
        
        double raiz = secante(x0, x1, tol, maxIter);
        
        System.out.println("La raiz aproximada es: " + raiz);
    }
    
}
