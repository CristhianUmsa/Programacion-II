package com.mycompany.ejercicio4_estadistica;
public class Estadistica {

    private double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {

        double suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }

        return suma / datos.length;
    }

    public double desviacion() {

        double prom = promedio();
        double suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += Math.pow(datos[i] - prom, 2);
        }

        return Math.sqrt(suma / (datos.length - 1));
    }
}