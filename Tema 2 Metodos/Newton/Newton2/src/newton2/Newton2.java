
package newton2;

import java.util.function.DoubleUnaryOperator;

public class Newton2 {
    
    public static double newtonRaphson(DoubleUnaryOperator f, DoubleUnaryOperator df, double x0, double tol, int maxIterations) {
        double x = x0;
        int iterations = 0;
        while (iterations < maxIterations) {
            double fx = f.applyAsDouble(x);
            double dfx = df.applyAsDouble(x);
            double deltaX = fx / dfx;
            x -= deltaX;
            if (Math.abs(deltaX) < tol || Math.abs(fx) < tol) {
                break; 
            }
            iterations++;
        }
        return x;
    }

    public static void main(String[] args) {
       
        DoubleUnaryOperator f = x -> Math.pow(Math.E, x)-3*x;
        DoubleUnaryOperator df = x -> Math.pow(Math.E, x)-3;

        double x0 = 1;
        double tol = 0.0001;
        int maxIterations = 1000;

        double root = newtonRaphson(f, df, x0, tol, maxIterations);

        System.out.println("La raiz aproximada es: " + root);
    }
    
}
