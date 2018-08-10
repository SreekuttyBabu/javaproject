package Threadpack;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Created by expertzlab12 on 7/19/18.
 */
public class Example {
    public static void main(String[] args)throws IOException
    {
        FileWriter fout=new FileWriter("exmp.txt");
        fout.write("hai good morning");
        fout.close();
        FileReader fin=new FileReader("exmp.txt");
        int ch;
        while((ch=fin.read())!=-1)
        {
            System.out.println((char)ch);
        }

    }
}
