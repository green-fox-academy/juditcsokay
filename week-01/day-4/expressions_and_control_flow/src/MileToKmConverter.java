import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Pls give me a distance(km)!");
        Scanner scanner = new Scanner(System.in);
        int distanceKm = scanner.nextInt();

        float distanceMiles = (float) (distanceKm * 0.62137);
        System.out.println("This is " + distanceMiles + " miles.");
    }
}