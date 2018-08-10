package Samples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expertzlab12 on 7/12/18.
 */
public class Sample {
    public static void main(String[] args)throws IOException {
        FileWriter fout=new FileWriter("output.txt");
        fout.write("hello");
        fout.close();
        System.out.println("read from first");
        FileReader fin=new FileReader("output.txt");
        int ch=0;
        FileWriter s=new FileWriter("new.txt");
        while((ch=fin.read())!=-1)
        {
            System.out.println((char)ch);
            s.write(ch);
        }
        s.close();
        System.out.println();
        FileReader l=new FileReader("new.txt");
        System.out.println("reading from the second file");
        int e=0;
        while((e=l.read())!=-1)
        {
            System.out.println((char)e);

        }

    }
}
