public class URLFixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    url = url.replace("bots", "odds");
    String[] somethingNew = url.split("/");
    System.out.println(url);
    String newUrl = "";
    for (int i = 0; i < somethingNew.length; i++) {
      System.out.println(somethingNew[i]);
      if (somethingNew[i] == somethingNew[0]) {
        System.out.println(somethingNew[i]);
        newUrl = newUrl.concat(somethingNew[i] + "://");
      } else {
        newUrl = newUrl.concat(somethingNew[i] + "/");
      }
    }
    System.out.println(newUrl);
  }
}
