package com.example.analisis_algoritmos;

//1 algoritmo de complejidad línea (que no sea búsqueda lineal):
public class SumaArreglo {
    public static int suma(int[] arreglo) {
        int sumaTotal = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaTotal += arreglo[i];
        }
        return sumaTotal;
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int resultado = suma(arreglo);
        System.out.println("La suma de los elementos del arreglo es: " + resultado);
    }
}

