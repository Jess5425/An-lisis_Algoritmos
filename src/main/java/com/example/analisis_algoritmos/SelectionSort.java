package com.example.analisis_algoritmos;

//1 algoritmo de complejidad cuadrática
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Array antes de ordenar:");
        printArray(array);

        // Medición del tiempo de inicio
        long startTime = System.nanoTime();

        selectionSort(array);

        // Medición del tiempo de finalización
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // Duración en nanosegundos

        System.out.println("\nArray después de ordenar:");
        printArray(array);

        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
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
}
