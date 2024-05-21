package implementacion;
import java.util.Scanner;

public class Implementacion {

    // Función para calcular las diferencias divididas
    public static double[] calcularDiferenciasDivididas(double[] x, double[] y) {
        int n = x.length;
        double[][] tablaDiferencias = new double[n][n];
        
        // Inicializar la primera columna con los valores de y
        for (int i = 0; i < n; i++) {
            tablaDiferencias[i][0] = y[i];
        }
        
        // Calcular las diferencias divididas
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                tablaDiferencias[i][j] = (tablaDiferencias[i + 1][j - 1] - tablaDiferencias[i][j - 1]) / (x[i + j] - x[i]);
            }
        }
        
        // Devolver la primera fila de la tabla de diferencias divididas
        double[] diferenciasDivididas = new double[n];
        for (int i = 0; i < n; i++) {
            diferenciasDivididas[i] = tablaDiferencias[0][i];
        }
        return diferenciasDivididas;
    }
    
    // Función para evaluar el polinomio de Newton en un punto x
    public static double evaluarPolinomioNewton(double[] x, double[] diferenciasDivididas, double valorX) {
        double interpolacion = 0.0;
        double producto = 1.0;
        
        for (int i = 0; i < x.length; i++) {
            interpolacion += diferenciasDivididas[i] * producto;
            producto *= (valorX - x[i]);
        }
        return interpolacion;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el número de puntos
        System.out.print("Ingrese el número de puntos conocidos: ");
        int numPuntos = scanner.nextInt();
        
        // Pedir al usuario los puntos conocidos
        double[] x = new double[numPuntos];
        double[] y = new double[numPuntos];
        for (int i = 0; i < numPuntos; i++) {
            System.out.print("Ingrese el valor de x[" + i + "]: ");
            x[i] = scanner.nextDouble();
            System.out.print("Ingrese el valor de y[" + i + "]: ");
            y[i] = scanner.nextDouble();
        }
        
        // Calcular las diferencias divididas
        double[] diferenciasDivididas = calcularDiferenciasDivididas(x, y);
        
        // Pedir al usuario el valor de x donde desea interpolar
        System.out.print("Ingrese el valor de x donde desea interpolar: ");
        double valorX = scanner.nextDouble();
        
        // Realizar interpolación de Newton
        double valorY = evaluarPolinomioNewton(x, diferenciasDivididas, valorX);
        
        // Mostrar resultado
        System.out.println("El valor interpolado de y en x = " + valorX + " es: " + valorY);
        
        scanner.close();
    }
}
/*
Imput
Ingrese el n�mero de puntos conocidos: 8
Ingrese el valor de x[0]: 1
Ingrese el valor de y[0]: 2
Ingrese el valor de x[1]: 3
Ingrese el valor de y[1]: 4
Ingrese el valor de x[2]: 5
Ingrese el valor de y[2]: 6
Ingrese el valor de x[3]: 7
Ingrese el valor de y[3]: 8
Ingrese el valor de x[4]: 9
Ingrese el valor de y[4]: 10
Ingrese el valor de x[5]: 11
Ingrese el valor de y[5]: 12
Ingrese el valor de x[6]: 13
Ingrese el valor de y[6]: 14
Ingrese el valor de x[7]: 15
Ingrese el valor de y[7]: 16
Ingrese el valor de x donde desea interpolar: 8.5

Ouput
El valor interpolado de y en x = 8.5 es: 9.5
*/
