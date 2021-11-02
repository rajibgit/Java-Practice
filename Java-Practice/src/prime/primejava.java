
package prime;

import java.util.Scanner;

public class primejava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num, count = 0;
        num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if(num%2==0){
                count++;
                break;   
            }   
        }
        if(count==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }
        
    }
}
