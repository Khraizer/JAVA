import java.util.*;
public class fibonacci{
	public static void main(String args[]){
		int num = 17;
		int fibonacci = 0;
		int estado2 = 1;
		int estado1;
		for(int i = 0; i < num; i++){
			System.out.println("Fibonacci: " + fibonacci);
			estado1 = fibonacci + estado2;
			fibonacci = estado2;
			estado2 = estado1;
		}
	}
}