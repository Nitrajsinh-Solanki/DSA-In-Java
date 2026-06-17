// find the a raise to power of b 

import java.util.Scanner;

class _06_PowerOfAToB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base number ");
        int base_number= sc.nextInt();
        System.out.println("enter the power ");
        int power = sc.nextInt();
        int multiply_num = 1 ; 

        for(int i = 1 ; i <= power;i ++ ){
                multiply_num = multiply_num * base_number;
        }
        System.out.println(base_number + "raise to power " + power + " is "+ multiply_num);
        sc.close();

    }
}