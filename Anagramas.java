import java.util.Arrays;
import java.util.Scanner;

public class Anagramas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba la primera palabra");
        String palabra1 = leer.nextLine().trim().toLowerCase();

        System.out.println("Escriba la segunda palabra");
        String palabra2 = leer.nextLine().trim().toLowerCase();

        boolean sonAnagramas = verificarAnagramas(palabra1, palabra2);

        if (sonAnagramas) {
            System.out.println("Las palabras son anagramas");
        } else {
            System.out.println("Las palabras no son anagramas");
        }
    }

    public static boolean verificarAnagramas(String palabra1, String palabra2) {
        char[] charsPalabra1 = palabra1.toCharArray();
        char[] charsPalabra2 = palabra2.toCharArray();

        Arrays.sort(charsPalabra1);
        Arrays.sort(charsPalabra2);

        String ordenada1 = new String(charsPalabra1);
        String ordenada2 = new String(charsPalabra2);

        return ordenada1.equals(ordenada2);
    }
}
