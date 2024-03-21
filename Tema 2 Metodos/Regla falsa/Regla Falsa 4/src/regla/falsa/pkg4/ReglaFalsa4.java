
package regla.falsa.pkg4;

public class ReglaFalsa4 {
    
    public static double funcion(double x){
        
        double potencia = Math.pow(x, 2)-4*x+3;
        return potencia;
    }
    
    public  double reglaFalsa(double a, double b, double porcentaje) {
        double c = 0;

        do {
            c = b - (funcion(b) * (a - b) / (funcion(a) - funcion(b)));

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
            double a = -1;
            double b = 1;
            double porcentaje = 0.05;
            ReglaFalsa4 var = new ReglaFalsa4();

            double root = var.reglaFalsa(a, b, porcentaje);
            
            System.out.println("La raiz aproximada con el Metodo dee la regla falsa es: "+ root);
            
        }catch(Exception e){
            System.out.println("Error al ingresar los datos.");
        }
    }
    
}
