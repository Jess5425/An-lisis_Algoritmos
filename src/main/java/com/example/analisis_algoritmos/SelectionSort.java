package com.example.analisis_algoritmos;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        // Tamaños de arreglos a probar
        int[] tamaños = {1000000};

        for (int tamaño : tamaños) {
            // Generar un nuevo arreglo de tamaño específico con números aleatorios
            int[] array = generarArregloAleatorio(tamaño);

            System.out.println("\nArray antes de ordenar:");


            // Medición del tiempo de inicio
            long startTime = System.nanoTime();

            selectionSort(array);

            // Medición del tiempo de finalización
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);  // Duración en nanosegundos

            System.out.println("\nArray después de ordenar:");


            System.out.println("Tiempo de ejecución para el tamaño " + tamaño + ": " + duration + " nanosegundos");
        }
    }

    // Implementación del algoritmo de selección
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Iterar sobre todo el array
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el mínimo elemento en el array no ordenado
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el mínimo elemento con el primer elemento del array no ordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Método para imprimir el array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Método para generar un arreglo aleatorio de un tamaño específico
    public static int[] generarArregloAleatorio(int tamaño) {
        int[] arreglo = new int[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }
        return arreglo;
    }
}
