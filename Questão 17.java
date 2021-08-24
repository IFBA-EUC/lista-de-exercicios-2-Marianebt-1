/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public String transformacao(int numero){
        return "";
    }
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int numero;
		String numeroRomano;
		
		System.out.println("Digite um número:");
		numero = leitor.nextInt();
		
		if(numero <= 999 && numero > 0) {
		    numeroRomano = transformacao(numero);
		}
	}
}
