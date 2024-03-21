
package biseccion;

public class Biseccion {

    public static double funcion(double x){        
        double potencia = (Math.pow(x, 4))+3*(Math.pow(x,3));
        return potencia-2;
    }
    
    public  double biseccion5(double a, double b, double porcentaje) {
        double c = 0;
        do {
            c = (a + b) / 2;

            if (funcion(c) == 0.0) {
                break;
            } else if (funcion(c) * funcion(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        } while (Math.abs(b - a) / b >= porcentaje);

        return c;
    }
    public static void main(String[] args) {
        try{
            double a = 0.5;
            double b = 1;
            double porcentaje = 0.05;
            Biseccion var = new Biseccion(); 
            double root = var.biseccion5(a, b, porcentaje);
            System.out.println("La raiz aproximada con el Metodo de biseccion es: "+ root);
            
        }catch(Exception e){
            System.out.println("Error al ingresar los datos.");
        }            
    }    
}