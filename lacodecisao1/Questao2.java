package lacodecisao1;
import java.util.Scanner;
public class Questao2 {
	
public static void main(String[] args) {
	
	int n1, n2, n3; 
	
	Scanner leia = new Scanner(System.in); 
	
	System.out.println("\nInsira o primeiro n�mero: ");
	n1 = leia.nextInt(); 
	System.out.println("\nInsira o segundo n�mero: "); 
	n2 = leia.nextInt(); 
	System.out.println("\nInsira o terceiro n�mero: "); 
	n3 = leia.nextInt(); 
	
	   
	if (n1 < n2 && n2 < n3) {
		n1 = leia.nextInt(); 
		System.out.println("Em ordem crescente: "+n1+", "+n2+", "+n3+".");
	} else if (n1 < n3 && n3 < n2) { 
		  n3 = leia.nextInt(); 
		  System.out.println("Em ordem crescente: "+n1+", "+n3+", "+n2+".");
	   } else if (n3 < n2 && n2 < n1 ) {
		   System.out.println("Em ordem crescente: "+n3+", "+n2+", "+n1+".");
	   } else if (n2 < n3 && n2 < n1) {
		   System.out.println("Em ordem crescente: "+n2+", "+n3+", "+n1+".");
	   } else if (n3 < n1 && n1 < n2 ) {
		   System.out.println("Em ordem crescente: "+n3+", "+n1+", "+n2+".");

	   } else { 
		   System.out.println("\nEm ordem crescente: "+n2+", "+n1+", "+n3+"."); 
	   }
	  
} 

}