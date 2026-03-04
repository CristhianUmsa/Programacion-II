package com.mycompany.ejercicio2_ecuacionlineal2x2;
import java.util.Scanner;
public class Ejercicio2_EcuacionLineal2x2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a, b, c, d, e, f: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        EcuacionLineal ecu =
                new EcuacionLineal(a,b,c,d,e,f);

        if (ecu.tieneSolucion()) {
            System.out.println("x = " + ecu.getX()
                    + ", y = " + ecu.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}