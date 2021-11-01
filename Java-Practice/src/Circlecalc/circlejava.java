
package Circlecalc;

import java.util.Scanner;

public class circlejava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radious, Area;
        System.out.print("Enter radious : ");
        radious = input.nextDouble();
        Area =3.1416 * radious * radious;
        System.out.println("Area of circle is : " +Area);
    }
  
}
