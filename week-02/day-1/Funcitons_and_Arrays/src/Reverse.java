public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    int[] aj = {3,4,5,6,7};
    int[] temp = new int[5];

    for (int i = aj.length-1; i >= 0; i--) {
        temp[(aj.length-1)-i] = aj[i];
      //System.out.println(temp[(aj.length-1)-i]);
    }
    aj = temp;
    for (int row : aj) {
      System.out.println(row);
    }
  }
}
