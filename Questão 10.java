/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Questão 10 {

	public static void main(String[] args) {
	 double rendainicial= 0;
	 double investimento;
	 double taxamensal = 0;
	 double rendafinal ;
	 String resposta= "S";
	 
	
	 Scanner digite = new Scanner (System.in);
	 
	 System.out.println("digite o investimento mensal:  ");
	 investimento = digite.nextDouble();
	 System.out.println( "digite o valor da taxa de juro mensal: ");
	 taxamensal = digite.nextDouble();
	  double taxa = taxamensal/100;
	 
	  double calculos= (Math.pow((1 + taxa), 12));
	  rendafinal = investimento * 12 + calculos;
	 do {
	 System.out.println( " Saldo do investimento após 1 ano:" + " R$" + rendafinal );
	 System.out.println( "deseja processar mais um ano? (S/N)" );
	  resposta = digite.next();
	 }
	 while(resposta.equals("S"));
		  }
		    
	  }