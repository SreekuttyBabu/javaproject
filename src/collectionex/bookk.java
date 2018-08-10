package collectionex;
import java.util.ArrayList;

/**
 * Created by expertzlab12 on 6/12/18.
 */
public class bookk {
    public static void main(String[] args) {
        book s1 = new book(101, "dr", "sf");
        book s2 = new book(102, "df", "hdh");
        ArrayList<book> st = new ArrayList();
        st.add(s1);
        st.add(s2);
        for (book stlist : st) {
            System.out.println("id:" + stlist.id + "bookname:" + stlist.bookname + "author:" + stlist.author);
        }
    }
}
