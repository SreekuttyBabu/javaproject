package modifiers;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by expertzlab12 on 6/19/18.
 */
public class arrayyboundd {
    public static void main(String[] args) {
        int z;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length of array");
        z=s.nextInt();
        int a[]=new int[z];
        Random r=new Random();
        for(int i=0;i<z;i++)
        {
            a[i]=r.nextInt(5);
        }
        System.out.println(yyArrays.toString(a));
    }
}
