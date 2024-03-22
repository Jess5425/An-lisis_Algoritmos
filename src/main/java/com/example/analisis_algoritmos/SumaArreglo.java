package com.example.analisis_algoritmos;

//1 algoritmo de complejidad línea (que no sea búsqueda lineal)
public class SumaArreglo {
    public static int suma(int[] arreglo) {
        int sumaTotal = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaTotal += arreglo[i];
        }
        return sumaTotal;
    }

    public static void main(String[] args) {
        // Diferentes tamaños de arrays para probar
        int[][] arreglos = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                // Puedes añadir más tamaños de arrays aquí
        };

        for (int[] arreglo : arreglos) {
            long startTime = System.nanoTime(); // Tiempo inicial
            int resultado = suma(arreglo);
            long endTime = System.nanoTime(); // Tiempo final

            long tiempoTranscurrido = endTime - startTime;

            System.out.println("Tamaño del arreglo: " + arreglo.length);
            System.out.println("La suma de los elementos del arreglo es: " + resultado);
            System.out.println("Tiempo transcurrido (nanosegundos): " + tiempoTranscurrido);
            System.out.println();
        }
    }
}
