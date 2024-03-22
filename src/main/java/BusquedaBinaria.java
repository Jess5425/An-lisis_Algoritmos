//1 algoritmo lineal logarítmico
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

    // Función de prueba
    public static void main(String[] args) {
        int[] arreglo = { 2, 3, 4, 10, 40 };
        int elementoABuscar = 10;
        int resultado = busquedaBinaria(arreglo, elementoABuscar);
        if (resultado != -1)
            System.out.println("El elemento " + elementoABuscar + " está presente en el índice " + resultado);
        else
            System.out.println("El elemento " + elementoABuscar + " no está presente en el arreglo.");
    }
}