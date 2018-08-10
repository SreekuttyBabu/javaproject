package Samples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by expertzlab12 on 7/11/18.
 */
public class FileEx {
    public static void main(String[] args)throws IOException {
        FileOutputStream f=new FileOutputStream("out.txt");
       // f.write(10001);//to write the value
       // FileOutputStream in=new FileOutputStream("out.txt");
        //System.out.println(in.read());

     //  f.write(b);
        byte b=(byte) 11111111;//to convert the corresponding bit decimal value
        f.write(b);
        FileInputStream fin=new FileInputStream("out.txt");
        int i=0;
        System.out.println(fin.read());
       // while((i=fin.read())!=-1)
        //{
        //    System.out.println((char)i);
        //}
       //String s="hello world";
        //byte[] b=s.getBytes();
        //fin.close();
    }
}
