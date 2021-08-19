/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Questão 4
{
		private String nome;
        private float preco;
        private double precot;
        private int quant;
        private double desconto;

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public int getQuant() {
    return quant;
}
public void setQuantidade(int quantidade) {
	this.quant = quant;
}
public double getPrecototal() {
	if (quant <=10) {
		
		return this.precototal = preco * quant;
	}	
	else if (quant <=20) {
		return (this.preco * quant );	
	
	}
	else if(quant <=50) {
		return (this.preco * quant); 	
	}
	return preco;
}
public void setPrecototal(float Precototal) {
		this.precototal = preco * quant;

		}
public void status() {
	System.out.println("Nome do produto: " + this.getNome());
	System.out.println("Preço: R$ " + this.getPreco());
	System.out.println(this.getQuant() + " quantidades");
	System.out.println("Valor total " + this.getPrecototal () + "R$");
	System.out.println("Valor com desconto " + "È o valor total menos * 0.2 mas desta maneira nao vai");
	System.out.println("Desconto é de: R$" + this.getPrecototal() * 0.1);
    
	}
}
