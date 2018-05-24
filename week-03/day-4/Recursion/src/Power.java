public class Power {

  public static void main(String[] args) {

    poweringWithLoop(3,4);
    poweringRecursive(3,3, 3);

  }

  private static int poweringRecursive(int base, int n, int power) {
    System.out.println(power);
    power *= base;
    if (n == 1) {
      return base;
    } else {
      return poweringRecursive(base, n-1, power);
    }
  }

  public static void poweringWithLoop(int base, int n) {
    int power = base;
    for (int i = 1; i < n; i++) {
      power *= base;
      System.out.println(power);
    }
  }

}
