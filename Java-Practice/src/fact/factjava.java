
package fact;

import java.util.Scanner;

public class factjava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0,fact = 1;
        System.out.print("Enter a Number :");
        num = input.nextInt();
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
            
        }
        System.out.println("Factorial of numbr : " +fact);
    }
}
