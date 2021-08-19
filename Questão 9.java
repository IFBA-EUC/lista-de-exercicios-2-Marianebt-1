/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Questão 9 {
 public static void main(String[] args) {
 for (int i = 2; i <= 8; i = i + 2) {
 for (int j = i; j <= 4; j++) {
 for (int k = 1; k <= j; k = k + i) {
 System.out.println(i + ", " + j + ", " + k);
 }
 }
 }
 }
}
// A saída do programa vai imprimir vários números separados por vírgulas, como por exemplo 2, 2, 1. 