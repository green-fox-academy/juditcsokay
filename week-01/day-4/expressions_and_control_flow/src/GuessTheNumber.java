import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int nstoreNumber = 14;

        System.out.println("I thought of a number! Guess!");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
    }
}
