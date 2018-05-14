public class PrintParams {

  public static void main(String[] args) {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourh")
    // ...

    String first = "first";
    printparams(first,"alma", "kutya");
  }

  private static void printparams(String... input) {
    for (String text : input) {
      System.out.print(text + " ");
    }
  }
}
