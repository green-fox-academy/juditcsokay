public class BlogPost {

  String authorName;
  String title;
  String text;
  String publicationDate;

  public static void main(String[] args) {

    BlogPost lorem = new BlogPost();
    lorem.title = "Lorem Ipsum";
    lorem.authorName = "John Doe";
    lorem.publicationDate = "2000.05.04.";
    lorem.text = "Lorem ipsum dolor sit amet.";

    BlogPost waitWhy = new BlogPost();
    waitWhy.title = "Wait but why";
    waitWhy.authorName = "Tim Urban";
    waitWhy.publicationDate = "2010.10.10.";
    waitWhy.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost engineer = new BlogPost();
    engineer.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    engineer.authorName = "William Turton";
    engineer.publicationDate = "2017.03.28.";
    engineer.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
            "When I asked to take his picture outside one of IBM’s New York City offices, " +
            "he told me that he wasn’t really into the whole organizer profile thing.";
  }

}
