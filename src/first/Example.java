package first;
import java.lang.String;

/**
 * Created by expertzlab12 on 6/22/18.
 */
public class Example {
    public static void main(String[] args) {
        String j="abc";
        String s="abc";
        String d="abc";
      j=j.concat("def");
      String s3="ABC";
      String s4="ghk";
        System.out.println(s==d);
        System.out.println(s.equals(s4));
        System.out.println(d.equals(s3));
    }
}
