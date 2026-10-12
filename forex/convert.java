package forex;
import java.util.Scanner;


public class convert {
    public static void main(String [] args) {
    
    Scanner input  = new Scanner(System.in);
     
    System.out.print("Enter the value of ksh:");


    double ksh=input.nextDouble();

    
    
    System.out.print("the value of conversionrate is:" );
    double conversionrate=input.nextDouble();

    double usd =ksh / conversionrate;
    System.out.println("the amount in ksh is: " + ksh); 
System.out.println("the conversion rate is: " + conversionrate);
 System.out.println("the amount in usd is: " + usd);
    
}
}
