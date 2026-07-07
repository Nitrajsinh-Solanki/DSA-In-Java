// 1 2 3 4 5
// 1       5
// 1       5
// 1       5
// 1 2 3 4 5 


import java.util.Scanner ; 


public class _13_SeventhPattern {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the rows ");
         int rows = sc.nextInt();

         for(int i = 1 ; i<= rows;i++){

            for(int j = 1 ; j <= rows;j++){
                if(i==1 || j==1 || i==rows || j==rows){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
         sc.close();


    }
}
