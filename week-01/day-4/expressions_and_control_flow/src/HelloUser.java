import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        System.out.println("Whats your name?");
        Scanner userName = new Scanner(System.in);
        String userInput1 = userName.nextLine();

        System.out.println("Hello " + userInput1 + "!");
    }
}