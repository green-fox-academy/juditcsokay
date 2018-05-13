import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        int number = 0;
        int temp = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Give me a nubmer!");
            Scanner scanner = new Scanner(System.in);
            temp = scanner.nextInt();

            number += temp;
            temp = 0;

        }
        System.out.println("Sum: " + number + ", Average: " + number/6);
    }
}
