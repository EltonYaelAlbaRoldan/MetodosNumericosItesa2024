
package newton4;

import java.util.function.DoubleUnaryOperator;

public class Newton4 {
    
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
        
        DoubleUnaryOperator f = x -> Math.sin(x)-Math.pow(x, 2);
        DoubleUnaryOperator df = x -> Math.cos(x)-2*x;

        double x0 = 1.5;
        double tol = 0.0001;
        int maxIterations = 1000;

        double root = newtonRaphson(f, df, x0, tol, maxIterations);

        System.out.println("La raiz aproximada es: " + root);
    }
    
}
