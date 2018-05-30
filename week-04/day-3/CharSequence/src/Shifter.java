public class Shifter implements CharSequence {

  static String s;
  static int shiftingValue;

  public Shifter(String s, int shiftingValue) {
    this.shiftingValue = shiftingValue;
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
    if (index <= s.length() - 1) {
      return s.charAt(index + shiftingValue);
    }
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String subString = "";
    for (int i = start + shiftingValue; i <= end + shiftingValue; i++) {
      subString += s.charAt(i);
    }
    return subString;
  }


  public static void main(String[] args) {

    Shifter s = new Shifter("example", 2);

    System.out.println(s.length());
    System.out.println(s.charAt(1));
    System.out.println(s.subSequence(1,4));

  }
}
