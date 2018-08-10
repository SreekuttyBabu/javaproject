package example;

/**
 * Created by expertzlab12 on 6/13/18.
 */
public class maxex {
    public static void main(String[] args) {
        int ar[]={60,15,89,45,654,43};
        int max=ar[0];
        int secmax=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
            {

              max= ar[i];
            }
        }
        for(int i=0;i<ar.length;i++)
        {

        }
        System.out.println("maximum is" + max);
        System.out.println("third maximum is:"+secmax);


    }
}
