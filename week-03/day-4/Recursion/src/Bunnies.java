public class Bunnies {

  public static void main(String[] args) {

    System.out.println(bunnyEarCunter(3));

  }

  private static int bunnyEarCunter(int numberOfBunnies) {
    if (numberOfBunnies == 0) {
      return 0;
    } else {
      return 2+ bunnyEarCunter(numberOfBunnies-1);
    }
  }
}
