import java.util.Scanner;

public class Nombre{
 public static void main(String args[]){
  
   System.out.println("Ingresa tu nombre");

   Scanner leer = new Scanner(System.in);
   String nombre = leer.nextLine();	
   System.out.println("¡Bienvenido!," + nombre + ", Eres aprendiz del ADSO 16");
	
}
}