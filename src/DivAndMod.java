/** DivAndMod
 */

import java.util.*;

public class DivAndMod
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //Variable declarations
        int dividend;   
        int divisor;
        int quotient;
        int remainder;
        
        //Input
        System.out.print( "What is the dividend? ");
        dividend = console.nextInt();
        System.out.print( "What is the divisor? ");
        divisor = console.nextInt();
        
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        
        //Output
        System.out.printf("The quotient of the %s divided by %s is %s and the remainder is %s. \n", dividend, divisor, quotient, remainder);
        
        
        
        
    }
} 