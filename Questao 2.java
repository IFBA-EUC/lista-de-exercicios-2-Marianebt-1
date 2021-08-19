/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Questao 2
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Distancia Dis = new Distancia(); 
		System.out.println("Digite os primeiros pontos"); 
		int x1 = in.nextInt(); 
		int x2 = in.nextInt(); 
		System.out.println("Digite os segundos pontos"); 
		int y1 = in.nextInt(); 
		int y2 = in.nextInt(); 
		System.out.println("Digite os terceiros pontos"); 
		int z1 = in.nextInt(); 
		int z2 = in.nextInt(); 
		System.out.printf("Distancia = %.2f", Dis.distancia(x1, x2, y1, y2, z1, z2)); 
		in.close();
	}
}

public class distancia { 
    public double distancia(int x1, int x2, int y1, int y2, int z1, int z2) { 
        double a= Math.pow((x2 - x1), 2);
        double b= Math.pow((y2 - y1),2); 
        double c= Math.pow((z2 - z1), 2); 
        double sl = a + b+ c; 
        double raiz = Math.sqrt(sl); 
        return raiz;
    }
}

