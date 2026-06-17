//  Count the total number of digits present in a given integer (n).

import java.util.Scanner ; 

public class _01_LenthOfDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = sc.nextInt();
        int count = 0 ; 
        while(n >  0 ){
            n = n / 10 ; 
            count ++ ; 
        }
        System.out.println("total digits in number is "+ count);

        sc.close();
        
    }
}