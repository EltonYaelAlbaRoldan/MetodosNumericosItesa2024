
package biseccion3;

public class Biseccion3 {

    public static double funcion(double x){        
        double potencia = Math.pow(x, 8)+10*(Math.pow(x,5));
        return potencia+20;
    }
    
    public  double biseccion3(double a, double b, double porcentaje) {
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
            double a = -3;
            double b = 0;
            double porcentaje = 0.05;
            Biseccion3 var = new Biseccion3(); 
            double root = var.biseccion3(a, b, porcentaje);
            System.out.println("La raiz aproximada con el Metodo de biseccion es: "+ root);
            
        }catch(Exception e){
            System.out.println("Error al ingresar los datos.");
        }            
    }    
}
