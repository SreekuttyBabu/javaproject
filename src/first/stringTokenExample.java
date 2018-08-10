package first;
import java.util.StringTokenizer;

/**
 * Created by expertzlab12 on 6/26/18.
 */
public class stringTokenExample {
    public static void main(String[] args) {
        StringTokenizer tokenizer=new StringTokenizer("hi hello,hw,r,u",",");
        //tokenizing string
        //use"," or( )space as delim to separate string
        while(tokenizer.hasMoreTokens())//for iterating number of strings
        {
            System.out.println(tokenizer.nextToken());//to print values
        }
    }

}
