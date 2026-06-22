// ****
// ***
// **
// *

import java.util.Scanner;


public class _10_FourthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows = sc.nextInt();

        for(int i = rows ; i >= 1 ; i -- ){
            for(int j = i ; j >= 1 ; j--  ){
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
