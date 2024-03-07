import java.util.Scanner;

public class Espacios {
    public static void main(String[] args) {
        System.out.println("Ingrese su texto"	);
        Scanner leer = new Scanner(System.in);
        String texto = leer.nextLine();
    texto = texto.replaceAll(" ","");

    System.out.println(texto);

 
}
