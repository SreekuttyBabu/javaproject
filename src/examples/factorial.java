package examples;

/**
 * Created by expertzlab12 on 6/20/18.
 */
public class factorial {
    static int  fact(int n) {
        int f;
        if (n == 1)
            return 1;
        else
            f = n * fact(n - 1);
        return f;
    }

    public static void main(String[] args) {
        int n=4;
        int f1=fact(4);
        System.out.println(f1);


    }
}
