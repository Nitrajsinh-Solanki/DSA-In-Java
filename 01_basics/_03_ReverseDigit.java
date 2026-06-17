// reverse the number 

import java.util.Scanner ; 

public class _03_ReverseDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = sc.nextInt();
        int ans  = 0 ; 
        while(n > 0 ){
            ans = ans * 10 + n % 10 ; 
            n = n / 10 ;
        }
        System.out.println("reversed number is "+ans);
      
        sc.close();

        
    }
}