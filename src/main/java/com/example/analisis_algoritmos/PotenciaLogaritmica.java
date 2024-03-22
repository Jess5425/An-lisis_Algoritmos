package com.example.analisis_algoritmos;

//1 algoritmo logarítmico
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

        // Medición del tiempo de inicio
        long startTime = System.nanoTime();

        double resultado = potencia(base, exponente);

        // Medición del tiempo de finalización
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // Duración en nanosegundos

        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + resultado);
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }
}
