
package Areacalc;

import java.util.Scanner;

public class areacalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double base,height,area;
        System.out.print("Enter base : ");
        base = input.nextDouble();
        
        System.out.print("Enter height : ");
        height = input.nextDouble();
        
        area = base * height * 0.5;
        
        System.out.println("Area of Triangle is : " +area);
    }
}
