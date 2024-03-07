import java.util.Scanner;

public class invertir{
 public static void main(String args[]){


  System.out.println("Ingrese su texto");
   Scanner leer = new Scanner(System.in);
    String texto = leer.nextLine();
       int i;
  System.out.print("Su texto fue invertido correctamente: "); 

  for(i = texto.length()-1; i >= 0;i--){
   System.out.print(texto.charAt(i));

}			
}
}