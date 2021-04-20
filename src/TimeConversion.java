/** TimeConversion
 
 */

import java.util.*;

public class TimeConversion
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //Varaible Declarations
        int minutes;
        int h;   //hours
        int remainder;  //remainder of minutes
        
        //Input
        System.out.print( "How many minutes? ");
        minutes = console.nextInt();
        
        h = minutes / 60;
        remainder = minutes % 60;
        
        //Output
        System.out.printf( "Hours is %d:%02d \n", h, remainder);      
       
        
    }
}