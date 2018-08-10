package Threadpack;

/**
 * Created by expertzlab12 on 7/17/18.
 */
public class Thread1Ex {
    int x;
    public Thread1Ex(int x)
    {
        this.x=x;
    }
    public void display()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i*x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
