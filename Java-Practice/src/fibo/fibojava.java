
package fibo;

import java.util.Scanner;

public class fibojava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print("Enter number : ");
        int firstnum = 0;
        int secondnum = 1;
        int fibo;
        System.out.print(firstnum+" "+secondnum);
        
        for (int i = 3; i <=num; i++) {
            fibo = firstnum + secondnum;
            System.out.print(" " +fibo);
            firstnum = secondnum;
            secondnum = fibo;
            
            
        }
        
        
        
        
    }
}
