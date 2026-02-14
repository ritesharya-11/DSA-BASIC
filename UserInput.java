// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1; i<=4; i++){

//             for(int j= 1;j<=i; j++){
//                 System.out.println("*");
//             }
        
//         }
//     }
// }
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter your name: ");

        // Read input
        String name = sc.nextLine();

        // Print output
        System.out.println("Hello, " + name);

        sc.close();
    }
}
