
package biseccion4;

public class Biseccion4 {

    public static double funcion(double x){        
        double potencia = 6-0.5*(Math.pow(x, 2))+2.5*x;
        return potencia+4.5;
    }
    
    public  double biseccion4(double a, double b, double porcentaje) {
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
            double a = 6;
            double b = 7;
            double porcentaje = 0.05;
            Biseccion4 var = new Biseccion4(); 
            double root = var.biseccion4(a, b, porcentaje);
            System.out.println("La raiz aproximada con el Metodo de biseccion es: "+ root);
            
        }catch(Exception e){
            System.out.println("Error al ingresar los datos.");
        }            
    }
}
