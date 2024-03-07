import java.util.Scanner;

public class Contar{
 public static void main(String args[]){


  System.out.println("Ingrese su parrafo");
   Scanner leer = new Scanner(System.in);
    String parrafo = leer.nextLine();
     System.out.println("La cantidad de palabras del parrafo es: " + ContarPalabras(parrafo));
}

public static int ContarPalabras(String cadena){
 String[] palabras = cadena.trim().split(" +");
  return palabras.length;
}
}