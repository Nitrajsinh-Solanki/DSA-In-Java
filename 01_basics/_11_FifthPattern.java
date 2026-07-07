//     *
//    ***
//   *****
//  *******
// *********


import java.util.Scanner;

public class _11_FifthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows = sc.nextInt();

        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j<= rows - i ; j++){
                System.out.print(" ");
            }
             for(int k = 1 ; k <= 2*i - 1 ; k++){
                System.out.print("*");
             }
             System.err.println();
        }
        sc.close();
    }
    
}


// | Row (`i`) | Spaces (`j <= rows - i`) | Stars (`k <= 2*i - 1`) | Output Shape |
// | --------- | -----------------------: | ---------------------: | ------------ |
// | 1         |               `rows - 1` |          `2*1 - 1 = 1` | `    *`      |
// | 2         |               `rows - 2` |          `2*2 - 1 = 3` | `   ***`     |
// | 3         |               `rows - 3` |          `2*3 - 1 = 5` | `  *****`    |
// | 4         |               `rows - 4` |          `2*4 - 1 = 7` | ` *******`   |
// | 5         |               `rows - 5` |          `2*5 - 1 = 9` | `*********`  |

