package examples;

/**
 * Created by expertzlab12 on 7/3/18.
 */
public class ExceptionExample {
    public void first()
    {
            second();

        }

    public void second()
    {
            third();
        }
        public void third() {
            throw new ArithmeticException("exception");
        }

    public static void main(String[] args) {
        ExceptionExample e=new ExceptionExample();
        try
        {
            e.first();
    }
    catch(Exception ex)
    {
        System.out.println("exception propagated");
    }
    }
}
