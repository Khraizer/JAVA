import java.util.Scanner;

public class repetidas{
 public static void main(String args[]){


  System.out.println("Ingrese su texto");
   Scanner leer = new Scanner(System.in);
    String texto = leer.nextLine();
     System.out.println("Ingrese la palabra a verificar");
      String palabra = leer.nextLine();
       int cont=0;
   
      

  int pos = texto.indexOf(palabra);

  while(pos!=-1){
   cont++;
   pos = texto.indexOf(palabra);
}
  System.out.println("La cantidad de veces que se repite la palabra es: " + cont); 			
}
}