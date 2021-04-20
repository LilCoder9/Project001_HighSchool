
/**
 * The height of an object at any given time dropped from a starting height
 * of 100 meters is given by the equation h=100-4.9t^2 where t is in seconds
 * Create an application that prompts the user for a time less than 4.5 seconds
 * and then displays the height of the object at that time.
 */

import java.util.*;

public class ObjectHeight
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //Variable declarations
        double time;
        double height;
        
        
        //Ask user for input values
        System.out.print( "How long ago did you drop the ball from 100 meters? ");
        time = console.nextDouble();
        
        if( time < 4.5 )
    {
        height = 100 - 4.9*time*time;
        
        // Output of height
        System.out.printf("The height of the ball from the gorund is %.2f\n", height);
        
    }
    {if( time >= 4.5 )
        System.out.printf("Sorry! That value is to huge.");
    }
    
    }
} 