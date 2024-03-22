package com.example.analisis_algoritmos;
//1 algoritmo exponencial
public class Exponencial {

    public static int calcularExponencial(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularExponencial(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2; // Base
        int exponente = 5; // Exponente

        // Medición del tiempo de inicio
        long startTime = System.nanoTime();

        int resultado = calcularExponencial(base, exponente);

        // Medición del tiempo de finalización
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // Duración en nanosegundos

        System.out.println(base + " elevado a la " + exponente + " es igual a: " + resultado);
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }
}
