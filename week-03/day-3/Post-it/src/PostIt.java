public class PostIt {

  String backgroundColor;
  String text;
  String textColor;

  public static void main(String[] args) {

    PostIt lilOrange = new PostIt();
    lilOrange.backgroundColor = "orange";
    lilOrange.textColor = "blue";
    lilOrange.text="Idea 1";

    PostIt lilPink = new PostIt();
    lilOrange.backgroundColor = "pink";
    lilOrange.textColor = "black";
    lilOrange.text="Awsome";

    PostIt lilYellow = new PostIt();
    lilOrange.backgroundColor = "yellow";
    lilOrange.textColor = "green";
    lilOrange.text="Superb!";

  }
}
