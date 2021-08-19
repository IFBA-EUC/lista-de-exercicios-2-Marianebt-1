/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Questão 8
{
          public static void main( String Args[ ] )
          {
                 int fibonacci = 0;
                 int num = 10;
                 for ( int i = 0; i <=10; i ++ )
                {
	      if ( i <= 2 )
	      { 
	              fibonacci = 1;
	              System.out.println( fibonacci );
	      }
	      else
	      {
                              fibonacci = ( i - 1 ) + ( i - 2 );
	              System.out.println( fibonacci );

	     }
                }
         }
}