package com.example.analisis_algoritmos;

//1 algoritmo de complejidad línea (que no sea búsqueda lineal)
import java.util.Random;

public class SumaArreglo {
    public static int suma(int[] arreglo) {
        int sumaTotal = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaTotal += arreglo[i];
        }
        return sumaTotal;
    }

    public static int[] generarArregloAleatorio(int tamaño) {
        int[] arreglo = new int[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }
        return arreglo;
    }

    public static void main(String[] args) {
        // Tamaños de arreglos a probar
        int[] tamaños = {1000, 10000, 100000, 1000000 };

        for (int tamaño : tamaños) {
            // Generar un nuevo arreglo de tamaño específico con números aleatorios
            int[] arreglo = generarArregloAleatorio(tamaño);

            long startTime = System.nanoTime(); // Tiempo inicial
            int resultado = suma(arreglo);
            long endTime = System.nanoTime(); // Tiempo final

            long tiempoTranscurrido = endTime - startTime;

            System.out.println("Tamaño del arreglo: " + tamaño);
            System.out.println("La suma de los elementos del arreglo es: " + resultado);
            System.out.println("Tiempo transcurrido (nanosegundos): " + tiempoTranscurrido);
            System.out.println();
        }
    }
}
