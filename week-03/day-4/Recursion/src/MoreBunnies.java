public class MoreBunnies {

  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    System.out.println(moreBunnyEarCounter(3));
  }

  private static int moreBunnyEarCounter(int numberOfBunnies) {
    if (numberOfBunnies  == 0) {
      return 0;
    } else {
      if (numberOfBunnies % 2 == 0) {
        return 3 + moreBunnyEarCounter(numberOfBunnies-1);
      } else {
        return 2 + moreBunnyEarCounter(numberOfBunnies-1);
      }
    }
  }
}
