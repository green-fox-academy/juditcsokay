import java.util.ArrayList;

public class Fibonacci {

  public static void main(String[] args) {
    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are
    // 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
    // and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.

    System.out.println(fibonacci( 6));

    System.out.println(fibonacciWithLoop(6));

  }

  private static int fibonacciWithLoop(int n) {
    ArrayList<Integer> fibonacci = new ArrayList<>();
    fibonacci.add(0);
    fibonacci.add(1);
    for (int i = 2; i <= n; i++) {
      fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i-2));
    }
    return fibonacci.get(n);
  }

  private static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      //System.out.println(n);
      return fibonacci(n-1)+fibonacci(n-2);
    }
  }
}
