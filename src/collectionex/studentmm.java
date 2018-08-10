package collectionex;
import java.util.ArrayList;
/**
 * Created by expertzlab12 on 6/12/18.
 */
public class studentmm {
    public static void main(String[] args) {
        studentt s1=new studentt(101,"dr",67);
        studentt s2=new studentt(102,"df",89);
        ArrayList<studentt> st=new ArrayList();
        st.add(s1);
        st.add(s2);
        for(studentt stlist:st)
        {
            System.out.println("id:"+stlist.id+"name:"+stlist.name+"mark:"+stlist.mark);
        }
    }
}
