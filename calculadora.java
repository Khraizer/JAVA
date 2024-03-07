import java.util.Scanner;
import java.util.*;
public class calculadora{

public static void main(String args[]){
	
System.out.println("A continuación, ingresa dos numeros para operarlos");
      Scanner leer = new Scanner(System.in); 
      double num[] = {leer.nextInt(), leer.nextInt(), 0, 0};


System.out.println("A continuación, ingresa la operacion a realizar\n1=Suma\n2=Resta\n3=Multiplicación\n4=Division\n5=Modulo\n6=Exponenciacion");

      num[3] = leer.nextInt();

if(num[3] == 1){
  num[2] = num[0] + num[1];
  System.out.println(Math.round(num[2]));

}

if(num[3] == 2){
  num[2] = num[0] - num[1];
  System.out.println(Math.round(num[2]));

}

if(num[3] == 3){
  num[2] = num[0] * num[1];
  System.out.println(Math.round(num[2]));

}

if(num[3] == 4){
  num[2] = num[0] / num[1];
  System.out.println(num[2]);

}

if(num[3] == 5){
  num[2] = num[0] % num[1];
  System.out.println(num[2]);

}

if(num[3] == 6){
  num[2] = Math.pow(num[0],num[1]);
  System.out.println(num[2]);
}
}
}