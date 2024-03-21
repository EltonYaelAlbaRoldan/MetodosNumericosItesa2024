
package biseccion2;

public class Biseccion2 {

    public static double funcion(double x){        
        double potencia = Math.pow(x, 4)-5*(Math.pow(x,2));
        return potencia+4;
    }
    
    public  double biseccion2(double a, double b, double porcentaje) {
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
            double a = 0;
            double b = 2;
            double porcentaje = 0.05;
            Biseccion2 var = new Biseccion2(); 
            double root = var.biseccion2(a, b, porcentaje);
            System.out.println("La raiz aproximada con el Metodo de biseccion es: "+ root);
            
        }catch(Exception e){
            System.out.println("Error al ingresar los datos.");
        }            
    }
    
}
