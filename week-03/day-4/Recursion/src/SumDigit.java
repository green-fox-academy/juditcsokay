public class SumDigit {

  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops). 
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    System.out.println(sumDigit(339, 0));
  }

  private static int sumDigit(int n, int sum) {
    sum += n % 10;
    n = n / 10;
    if (n % 10 == n) {
      return sum+=n;
    } else {
      return sumDigit(n,sum);
    }
  }
}
