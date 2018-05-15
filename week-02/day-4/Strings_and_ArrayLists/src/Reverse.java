public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
    
    System.out.println(reverseString(reversed));

  }

  private static String reverseString(String reversed) {
    String[] temp = reversed.split("");
    String goodDirection = "";
    for (int i = temp.length-1; i >=0 ; i--) {
      goodDirection = goodDirection.concat(temp[i]);
      //System.out.println(goodDirection);
    }
    return goodDirection;
  }

}
