package Samples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

/**
 * Created by expertzlab12 on 7/12/18.
 */
public class Sample1 {
    public static void main(String[] args)throws IOException {
        File f=new File("first","file");
        f.mkdirs();
        System.out.println(f.exists());
        //to create directory
        //f.exists();//checks if a file or directory already exists
        File f1=new File("sample","file1.txt");
        f1.getParentFile().mkdirs();
        f1.createNewFile();
        System.out.println(f.getPath());
        System.out.println(f.getAbsoluteFile());




        //f1.delete();
        File f4=new File("sample.txt");
        f4.createNewFile();
        FileOutputStream f5=new FileOutputStream(f4);
        f5.write(3);
        f5.close();
        FileInputStream f6=new FileInputStream(f4);
        System.out.println(f6.read());

    }
}
