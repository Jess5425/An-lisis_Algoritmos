package com.example.analisis_algoritmos;

//1 algoritmo lineal logarítmico
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arraySizes = {1000, 10000, 100000, 1000000}; // Cambia estos tamaños de array según tus necesidades

        for (int size : arraySizes) {
            int[] arr = generateRandomArray(size);

            long startTime = System.nanoTime();
            quickSort(arr, 0, arr.length - 1);
            long endTime = System.nanoTime();

            long executionTimeNs = endTime - startTime;
            System.out.println("Tamaño del array: " + size + ", Tiempo de ejecución (en nanosegundos): " + executionTimeNs);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
}
}
