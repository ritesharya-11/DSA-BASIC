import java.util.Scanner;

public class main {
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
