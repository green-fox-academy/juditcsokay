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

        int numberOfColumns = 1;
        String pattern = "*";
        String emptyPattern =" ";

        for (int i = 0; i < numberOfLines-1; i++) {
            numberOfColumns = numberOfColumns+2;
        }

        for (int i = 0; i < numberOfLines; i++)
            for (int j = 0; j < numberOfColumns; j++) {

                System.out.print(pattern);
            }
            System.out.println();

    }
}
