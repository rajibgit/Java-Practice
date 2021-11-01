
package Temparatureconv;

import java.util.Scanner;

public class tempconv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsious, fahrenheit;
        System.out.print("Enter Temparature in celsius : ");
        double celsius = input.nextDouble();
        
        double farenheit = (9/5) * celsius +32;
        System.out.println("Coverted Temparature on Farenheit : " +farenheit);
        
        //Revers on farenheit to celsius
        
    }
}
