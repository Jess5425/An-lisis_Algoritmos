package com.example.analisis_algoritmos;

import java.util.Random;

public class SequentialSearchWorstCase { //Hace la búsqueda secuencial.

    public static void main(String[] args) {
        int arraySize = 65000;  //Este es el valor que se cambia para probar la duración con diferentes tamaños.
        int searchValue = 55; //Este es el valor que se va a buscar.
        int[] array = generateRandomArray(arraySize, searchValue); //Genera el array random.

        long startTime = System.nanoTime();
        int searchIndex = sequentialSearch(array, searchValue); //Esta variable guarda la posición del valor si existe.
        long endTime = System.nanoTime();

        System.out.println("Tamaño del array: " + arraySize);
        System.out.println("Valor buscado: " + searchValue);
        System.out.println("Tiempo de búsqueda: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Resultado: " + (searchIndex != -1 ? "Found" : "Not found"));
    }

    //Array random
    public static int[] generateRandomArray(int arraySize, int searchValue) {
        int[] array = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize - 1; i++) {
            array[i] = random.nextInt(searchValue);
        }

        return array;
    }

    //Búsqueda secuencial
    public static int sequentialSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }
}