import java.util.*;
public class Order
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        
        //Declarations
        int burgers;
        int fries;
        int sodas;
        double total;
        double burgerscost;
        double friescost;
        double sodascost;
        double finalcost;
        double tax;
        double money;
        double change;
        
        //Input
        System.out.print( "How many burgers would you like? ");
        burgers = console.nextInt();
        System.out.print( "How many fries would you like? ");
        fries = console.nextInt();
        System.out.print( "How many sodas would you like? ");
        sodas = console.nextInt();
        
        //Math
        burgerscost = 1.69;
        friescost = 1.09;
        sodascost = .99;
        
        total = ( burgerscost * burgers) + ( friescost * fries) + ( sodascost * sodas);
        tax = .065 * total;
        finalcost = total + tax;
        
        //Output
        System.out.printf( "The total cost of your meal is $%.2f \n", finalcost);
        
        //Input
        System.out.print( "How much money are you giving the cashier? ");
        money = console.nextDouble();
        
        //Math
        change = money -finalcost ;
       
        //Output
        System.out.printf( "Your change will be $%.2f \n", change);
        
      
        
    }    
}        