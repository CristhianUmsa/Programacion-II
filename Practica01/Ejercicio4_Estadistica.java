package com.mycompany.ejercicio4_estadistica;
import java.util.Scanner;
public class Ejercicio4_Estadistica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < 10; i++) {
            datos[i] = sc.nextDouble();
        }

        Estadistica est = new Estadistica(datos);

        System.out.println("El promedio es: " + est.promedio());
        System.out.println("La desviacion estandar es: " + est.desviacion());
    }
}