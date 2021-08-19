/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class questão 1
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		double a;
		double b; 
		double c; 
		double delta; 
		double x1; 
		double x2; 
		System.out.println("Digite o valor de A: "); 
		a = scan.nextDouble(); 
		while(a==0);
		System.out.println("O valor de A não deve ser zero a equação é do 2º grau !\n escreva outro numero!");
		System.out.println("Digite o valor de A: ");
		a = scan.nextDouble();
		System.out.println("Digite o valor de B: "); 
		b = scan.nextDouble();
		System.out.println("Digite o valor de C:");
		c = scan.nextDouble();
		delta = ((b*b)-(4*a*c));
		x1 = 0; 
		x2 = 0;
		if (delta >= 0){
		    x1 = (-b + Math.sqrt (delta)) / ( 2*a ); 
		    x2 = (-b - Math.sqrt (delta)) / ( 2*a ) ;
		    System.out.println("Delta é igual :"+ delta); 
		    System.out.println("x1 é igual: "+ x1 + "\nx2 vale: "+ x2);
	}
	else{ 
	    System.out.println("delta invalida");
	}
	scan.close(); 
	}
}
