package com.example.analisis_algoritmos;

//1 algoritmo lineal logarítmico

import java.util.Arrays;

public class BusquedaBinaria {

    // Función para buscar un elemento en un arreglo ordenado de enteros
    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Si el elemento está presente en el medio, se ha encontrado
            if (arreglo[medio] == elemento)
                return medio;

            // Si el elemento es mayor, se busca en la mitad derecha del arreglo
            if (arreglo[medio] < elemento)
                izquierda = medio + 1;

                // Si el elemento es menor, se busca en la mitad izquierda del arreglo
            else
                derecha = medio - 1;
        }

        // Si el elemento no está presente en el arreglo
        return -1;
    }

    // Función para generar un arreglo ordenado de enteros aleatorios
    public static int[] generarArregloOrdenado(int tamaño) {
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = i; // Asigna valores ordenados al arreglo
        }
        return arreglo;
    }

    // Función de prueba para medir el tiempo de búsqueda
    public static void main(String[] args) {
        // Tamaños de arreglo a probar
        int[] tamaños = {1000, 10000, 100000, 1000000};

        // Realizar la prueba para cada tamaño de arreglo
        for (int tamaño : tamaños) {
            // Generar un nuevo arreglo de tamaño específico
            int[] arreglo = generarArregloOrdenado(tamaño);

            // Elemento a buscar (en este caso, el último elemento)
            int elementoABuscar = tamaño - 1;

            // Medir el tiempo de búsqueda
            long startTime = System.nanoTime();
            int resultado = busquedaBinaria(arreglo, elementoABuscar);
            long endTime = System.nanoTime();
            long tiempoDeBusqueda = endTime - startTime;

            // Imprimir el resultado y el tiempo de búsqueda
            if (resultado != -1)
                System.out.println("Tamaño del arreglo: " + tamaño + ", Elemento " + elementoABuscar + " encontrado en el índice " + resultado + ", Tiempo de búsqueda: " + tiempoDeBusqueda + " nanosegundos");
            else
                System.out.println("Tamaño del arreglo: " + tamaño + ", Elemento " + elementoABuscar + " no encontrado, Tiempo de búsqueda: " + tiempoDeBusqueda + " nanosegundos");
        }
    }
}
