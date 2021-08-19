/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// O programa correto é o A
import java.util.Scanner;
public class Questao 7 {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 int codigo;
 
 System.out.println("Informe o código: ");
 codigo = teclado.nextInt();
 while (codigo != -1) {
 System.out.println("Código: " + codigo);
 System.out.println("Informe o código: ");
 codigo = teclado.nextInt();
 }
 }
}
// O programa B ficaria correto assim:
import java.util.Scanner;
public class Questao 7 {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 int codigo;
 

 System.out.print("Informe o código: ");
 codigo = teclado.nextInt();
 System.out.println("Código: " + codigo);
 System.out.println("Informe o código: ");
 while (codigo != -1);
 codigo = teclado.nextInt();
 }
}

