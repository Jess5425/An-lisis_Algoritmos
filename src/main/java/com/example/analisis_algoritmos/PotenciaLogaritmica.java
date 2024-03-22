package com.example.analisis_algoritmos;

public class PotenciaLogaritmica {

    // Función para calcular la potencia de un número de manera eficiente
    public static double potencia(double base, int exponente) {
        if (exponente == 0)
            return 1;

        double mitadPotencia = potencia(base, exponente / 2);

        if (exponente % 2 == 0)
            return mitadPotencia * mitadPotencia;
        else
            return base * mitadPotencia * mitadPotencia;
    }

    // Función de prueba
    public static void main(String[] args) {
        double base = 2.0;
        int exponente = 5;
        double resultado = potencia(base, exponente);
        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + resultado);
    }
}