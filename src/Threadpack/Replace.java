package Threadpack;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expertzlab12 on 7/20/18.
 */
public class Replace {
    public static void main(String[] args)throws IOException {
        try {
            FileWriter fout = new FileWriter("out.txt");
            fout.write("hello good morning");
            fout.close();
            String line = "", oldtext = "";
            while ((line != null)) {
                oldtext += line + "\r\n";
            }
            String newtext = oldtext.replaceAll("hello good morning", "hello good day");
            System.out.println(newtext);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
