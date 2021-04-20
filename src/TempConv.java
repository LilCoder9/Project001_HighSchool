
/** DivAndMod
 */

import java.util.*;

public class TempConv
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        // Variable declaration
        double celsius;
        double fahrenheit;
        
        // Ask user input values
        System.out.print( "What is the temmperature in degrees in Celsuis? ");
        celsius = console.nextDouble();
        
        fahrenheit =  ( 1.8 * celsius ) + 32;
        
    
        
        // Output fahrenheit to celsius
        System.out.printf(" The temperature %s converted into Fahrenheit is %.2f\n ", celsius, fahrenheit); 
        
        
        
        
    }
}