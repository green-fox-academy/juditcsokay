import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        System.out.println("Give me the number of the diamond's lines! It should be an odd number");
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();

        int numberOfZeros = (numberOfLines / 2 + 1) - 1;
        int numberOfAsterisks = 0;

        //System.out.println(numberOfLines / 2 + 1);

        for (int i = 0; i <= numberOfLines; i++) {
            if (i < numberOfLines / 2 + 1) {
                numberOfAsterisks = i * 2 + 1;
                for (int j = 0; j < numberOfZeros; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < numberOfAsterisks; k++) {
                    System.out.print("*");
                }
                numberOfZeros = numberOfZeros - 1;
                //System.out.println(numberOfZeros);
                System.out.println("");
            } else if (i == numberOfLines / 2 + 1) {
                numberOfZeros = numberOfZeros+2;
                numberOfAsterisks = numberOfAsterisks-2;
            } else {
                    //System.out.println(numberOfAsterisks);
                    for (int j = 0; j < numberOfZeros; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < numberOfAsterisks; k++) {
                        System.out.print("*");
                    }
                    numberOfZeros = numberOfZeros + 1;
                    //System.out.println(numberOfAsterisks);
                    numberOfAsterisks = numberOfAsterisks-2;
                    //System.out.println(numberOfAsterisks);
                    System.out.println("");
                }
            }
    }
}
