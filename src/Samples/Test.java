package Samples;

/**
 * Created by expertzlab12 on 7/11/18.
 */
public class Test {
    public static void main(String[] args) {
        Author author=new Author(49,"Chatan bagat",767899);
        Book b=new Book("half girl friend","101",150,author);
         b.display();
         author.display();
    }
}
