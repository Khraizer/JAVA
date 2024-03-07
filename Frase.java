import java.util.Scanner;

public class Frase{
 public static void main(String args[]){
  
   System.out.println("Ingrese una frase");

   Scanner leer = new Scanner(System.in);
   String frase = leer.nextLine();	
   System.out.println("Tu frase es: " + frase);
	
}
}