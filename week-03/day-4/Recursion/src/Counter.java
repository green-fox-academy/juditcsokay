public class Counter {

  public static void main(String[] args) {

    countDown(5);
  }

  public static int countDown(int n) {
    System.out.println(n);
    if (n == 0) {
      return 0;
    } else {
      return countDown(n-1);
    }
  }


}
