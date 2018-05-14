public class Sum {

  public static void main(String[] args) {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer

    int sum = 5;
    sum = sum(sum);
    System.out.println(sum);
  }

  private static int sum(int numbers) {
    int amount = 0;
    for (int i = 0; i < numbers; i++) {
      amount = amount + i;
    }
    return amount;
  }
}
