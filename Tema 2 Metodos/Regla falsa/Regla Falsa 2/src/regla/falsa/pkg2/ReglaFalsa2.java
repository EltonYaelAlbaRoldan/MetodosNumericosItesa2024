
package regla.falsa.pkg2;

public class ReglaFalsa2 {
    
    public static double funcion(double x){
        
        double potencia = recortarDecimales(Math.pow(x, 3), 5)-2*x;
        return potencia-5;
    }
    private  static double recortarDecimales(double numero, int decimales) {
        double factor = Math.pow(10, decimales);
        return ((int) (numero * factor)) / factor;
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
            double a = 2;
            double b = 3;
            double porcentaje = 0.05;
            ReglaFalsa2 var = new ReglaFalsa2();

            double root = var.reglaFalsa(a, b, porcentaje);
            
            System.out.println("La raiz aproximada con el Metodo dee la regla falsa es: "+ root);
            
        }catch(Exception e){
            System.out.println("Error al ingresar los datos.");
        }
    }
    
}
