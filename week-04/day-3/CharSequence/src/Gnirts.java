public class Gnirts implements CharSequence{

  static String s;

  public Gnirts(String s) {
    this.s = s;
  }

  @Override
  public int length() {
    int numberOfChars = 0;
    String[] splitted = s.split("");
    for (String Char : splitted) {
      numberOfChars++;
    }
    return numberOfChars;
  }

  @Override
  public char charAt(int index) {
        return s.charAt((s.length() - 1) - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String subString = "";
    for (int i = start; i <= end; i++) {
      subString += s.charAt((s.length() - 1) - i);
    }
    return subString;
  }


  public static void main(String[] args) {

    Gnirts s = new Gnirts("example");

    System.out.println(s.length());
    System.out.println(s.charAt(5));
    System.out.println(s.subSequence(1,5));

  }
}
