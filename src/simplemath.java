import java.util.*;
public class simplemath 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        
        //Declarations
        double a;
        double b;
        int loop=1;
        int awe;
        String mm;
        
        //Input
        System.out.println( "Welcome To Simple Math?");
        
        System.out.print( "Variable 1: ");
        a = console.nextDouble();
    
        System.out.print( "Variable 2: ");
        b = console.nextDouble();
        
        System.out.print("What function would you like me to solve? \n OPTIONS:\n Add = 1\n Subtract=2\n Mutlyply=3\n Divide=4\n");
        awe =console.nextInt();
        
        if(awe == 1)
           { a = a + b;}
        else if( awe == 2)
            {a = a - b;}
        else if( awe == 3)
            {a = a * b;}
        else
            {a = a / b;}
        
        System.out.printf("Your answer is %.2f \n", a);
    
        
        
    }
    }    
      