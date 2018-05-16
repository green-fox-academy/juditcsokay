import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    int number = 0;

    dividyByZero(number);
  }

  private static void dividyByZero(int number) {
    System.out.println("Give me a number please!");
    Scanner scanner = new Scanner(System.in);
    number = scanner.nextInt();

    try {
      int result = 10 / number;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
