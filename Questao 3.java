/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Questao 3 { 
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        double x1, y1, x2, y2, distancia; 
        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:"); 
        x1 = teclado.nextFloat(); 
        y1 = teclado.nextFloat(); 
        x2 =  teclado.nextFloat(); 
        y2 = teclado.nextFloat(); 
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
        System.out.println("A distância é: " + distancia); 
        } 
    
}
// O erro está na divisão 1/2.
