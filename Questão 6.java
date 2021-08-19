/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Questão 6 {
	public static int qtdDigitos (long n) {
		n = Math.abs(n);
		if (n == 0) return 1;
		else return (int) (Math.log10 (n) + 1); 
	}
	public static void main(String[] args) {
		System.out.println (qtdDigitos (1)); 
		System.out.println (qtdDigitos (2)); 
		System.out.println (qtdDigitos (10)); 
		System.out.println (qtdDigitos (11)); 
		System.out.println (qtdDigitos (100));
		System.out.println (qtdDigitos (2003)); 
		System.out.println (qtdDigitos (2001)); 
	}
}
