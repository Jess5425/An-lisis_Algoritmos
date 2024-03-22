package com.example.analisis_algoritmos;
//1 algoritmo exponencial
public class ExponentialAlgorithm {
    public static void main(String[] args) {
        int[][] arrays = { new int[1000000] };

        for (int i = 0; i < arrays.length; i++) {
            // Llenamos los arreglos con números aleatorios
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = (int) (Math.random() * 1000);
            }

            // Iniciamos el temporizador
            long startTime = System.nanoTime();

            // Llamamos al método que realiza el recorrido exponencial
            exponentialTraversal(arrays[i]);

            // Finalizamos el temporizador y mostramos el tiempo transcurrido en nanosegundos
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tiempo para el array de tamaño " + arrays[i].length + ": " + duration + " nanosegundos");
        }
    }

    public static void exponentialTraversal(int[] array) {
        int n = array.length;
        // Recorremos todos los subconjuntos posibles del array
        for (int i = 0; i < (1 << n); i++) {
            // Imprimimos el subconjunto actual
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(array[j] + " ");
                }
            }
            System.out.println();
        }
    }

}
