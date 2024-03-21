package com.example.analisis_algoritmos;

import java.util.Random;

public class SequentialSearchWorstCase {

    public static void main(String[] args) {
        int arraySize = 10000;
        int searchValue = 10001;
        int[] array = generateRandomArray(arraySize, searchValue);

        long startTime = System.nanoTime();
        int searchIndex = sequentialSearch(array, searchValue);
        long endTime = System.nanoTime();

        System.out.println("Array size: " + arraySize);
        System.out.println("Search value: " + searchValue);
        System.out.println("Search time: " + (endTime - startTime) + " nanoseconds");
        System.out.println("Search result: " + (searchIndex != -1 ? "Found" : "Not found"));
    }

    public static int[] generateRandomArray(int arraySize, int searchValue) {
        int[] array = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize - 1; i++) {
            array[i] = random.nextInt(searchValue);
        }

        return array;
    }

    public static int sequentialSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }
}