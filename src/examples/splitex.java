package examples;

import java.util.Arrays;

/**
 * Created by expertzlab12 on 6/18/18.
 */
public class splitex {
    public static void main(String[] args) {
        int ar[]={10,20,30,40,50,60};
        int n=ar.length;
        int a[]=new int [n/2];
        int b[]=new int [n-a.length];
        for(int i=0;i<ar.length;i++)
        {
          if(i<a.length)
          {
              a[i]=ar[i];
          }
          else
            {
                b[i-a.length]=ar[i];
            }
        }
        System.out.println("first array:");
        for(int k:a) {
            System.out.println(k);
        }
        System.out.println("second array:");
        for(int j:b)
        {
            System.out.println(j);
        }
       // System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(b));
    }
}
