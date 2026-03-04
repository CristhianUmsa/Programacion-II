package com.mycompany.ejercicio3_ecuacioncuadratica;
import java.util.Scanner;
public class Ejercicio3_EcuacionCuadratica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        EcuacionCuadratica ecu =
                new EcuacionCuadratica(a,b,c);

        double d = ecu.getDiscriminante();

        if (d > 0) {
            System.out.println("Dos raices: "
                    + ecu.getRaiz1() + " y "
                    + ecu.getRaiz2());
        } else if (d == 0) {
            System.out.println("Una raiz: "
                    + ecu.getRaiz1());
        } else {
            System.out.println("No tiene raices reales");
        }
    }
}