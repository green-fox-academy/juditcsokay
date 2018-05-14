public class Factorial {
  public static void main(String[] args) {
    //  Create the usual class wrapper
    //  and main method on your own.
    
    // - Create a function called `factorio`
    //   that returns it's input's factorial

    int input = 5;
    input = factorio(input);
    System.out.println(input);
  }

  public static int factorio (int number){
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
