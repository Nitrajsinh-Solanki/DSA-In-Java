// printing the first n factorial upto n 
import java.util.Scanner;;

public class _05_FirstNFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int n = sc.nextInt();

        int temp_ans = 1 ;
       for(int i = 1 ; i <= n ; i++ ){
            temp_ans = temp_ans* i ; 
            System.out.println(temp_ans + " ");
       }
       sc.close();
    }
}
