public class Exponencial {

    public static int calcularExponencial(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularExponencial(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2; // Base
        int exponente = 5; // Exponente
        int resultado = calcularExponencial(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a: " + resultado);
    }
}

