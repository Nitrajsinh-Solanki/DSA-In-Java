// Calculate the sum of all individual digits in a given integer (n).

import java.util.Scanner ; 

public class _02_SumOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = sc.nextInt();
        int sum = 0 ; 

        while(n > 0 ){
            int last_digit  = n % 10 ; 
            sum += last_digit;
            n = n / 10 ; 

        }
        System.out.println("sum of digit is "+ sum);
        sc.close();

        
    }
}