//Problem Statement:
// Find the sum of the following series up to n terms 
// 1 - 2 + 3 - 4 + 5 - 6 +... n 

import java.util.Scanner;


public class _04_SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = sc.nextInt(); 

        int ans = 0 ;
        for(int i = 1 ; i <=  n ; i ++ ){
            if(i % 2 != 0 ){
                ans = ans + i ; 
            }
            else{
                ans = ans - i ; 
            }
        }
        System.out.println("the final result is " + ans);
        sc.close();
    }
}
