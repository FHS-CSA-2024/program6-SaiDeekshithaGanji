//Import stuff here
import java.util.Scanner;

//your code here
public class p6{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        //create variables
        final double pi = 3.14159;
        double r;
        double d;
        double circ;
        double A;
        
        //ask for input:
        System.out.print("Enter the radius: ");
        r = myScanner.nextDouble();
        
        //calculations
        d = 2*r;
        circ = 2*pi*r;
        A = pi*(r*r);
        
        //Casting them to be three decimals in 
        // multiply by 1000.0
        //change it to int
        // change it to double
        //divide by 1000.0
        // print statements
        r =  (r * 1000.0)+0.5;
        r = (int) r;
        r = (double)r / 1000.0;
        
        d =  (d * 1000.0)+0.5;
        d = (int) d;
        d = (double)d / 1000.0;
        
        A =  (A * 1000.0)+0.5;
        A = (int) A;
        A = (double)A / 1000.0;
        
        circ =  (circ * 1000.0)+0.5;
        circ = (int) circ;
        circ = (double)circ / 1000.0;
        //d =  Math.round(d * 1000.0) / 1000.0;
        //A =  (A * 1000.0) / 1000.0;
        //circ = (circ * 1000.0) / 1000.0;
        
        System.out.println("\nThe Radius of the circle is: " + r);
        System.out.println("\nThe Diameter of the circle is: " + d);
        System.out.println("\nThe Area of the circle is: " + A);
        System.out.println("\nThe Circumference of the circle is: " + circ);
        
    
    
    }
}

//Paste console output below:
/*

Enter the radius: 3.712

The Radius of the circle is: 3.712

The Diameter of the circle is: 7.424

The Area of the circle is: 43.288

The Circumference of the circle is: 23.323



*/
