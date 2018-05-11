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

        int storedNumber = 14;

        System.out.println("I thought of a number! Guess!");
        Scanner scanner = new Scanner(System.in);
        int guessNum = scanner.nextInt();

        while (guessNum != storedNumber) {
            if (guessNum < storedNumber) {
                System.out.println("The stored number is higher!");
                System.out.println("Guess more!");
                guessNum = scanner.nextInt();
            } else if (guessNum > storedNumber) {
                System.out.println("The stored number is lower!");
                System.out.println("Guess more!");
                guessNum = scanner.nextInt();
            }
        }
        System.out.println("You found the number: " + storedNumber);
    }
}
