import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        System.out.println("Give me the number of the piramid's lines!");
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();

        int numberOfZeros = numberOfLines-1;
        int numberOfAsterisks = 0;

        for (int i = 0; i < numberOfLines; i++) {
            numberOfAsterisks = i * 2 + 1;
            for (int j = 0; j < numberOfZeros; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numberOfAsterisks; k++) {
                System.out.print("*");
            }
            numberOfZeros = numberOfZeros-1;
            System.out.println("");
        }
    }
}
