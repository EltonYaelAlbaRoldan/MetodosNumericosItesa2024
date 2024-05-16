package examen;

import java.util.Scanner;

public class Examen {

    public static double interpolar(double x, double x0, double y0, double x1, double y1) {
        return y0 + (x - x0) * (y1 - y0) / (x1 - x0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las coordenadas del primer punto (x0 y0):");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        
        System.out.println("Ingrese las coordenadas del segundo punto (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese el valor de x para interpolar:");
        double x = scanner.nextDouble();

        double resultado = interpolar(x, x0, y0, x1, y1);

        System.out.println("El valor interpolado para x = " + x + " es y = " + resultado);
        scanner.close();
    }   
}
/*
Imput
Ingrese las coordenadas del primer punto (x0 y0):
5 10
Ingrese las coordenadas del segundo punto (x1 y1):
15 20
Ingrese el valor de x para interpolar:
8

Ouput
El valor interpolado para x = 8.0 es y = 13.0
*/