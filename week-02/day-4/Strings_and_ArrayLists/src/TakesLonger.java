public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    String[] piecesOfQuote = quote.split(" ");
    String newQuote = "";

    for (int i = 0; i < piecesOfQuote.length; i++) {
      newQuote = newQuote.concat(piecesOfQuote[i] + " ");
      if (piecesOfQuote[i] == piecesOfQuote[2]) {
        newQuote = newQuote + "always takes longer than ";
      } else {}
    }
    System.out.println(newQuote);
  }
}