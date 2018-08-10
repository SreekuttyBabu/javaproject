package Threadpack;

/**
 * Created by expertzlab12 on 7/17/18.
 */
public class ThreadEx1 implements Runnable {
    public void run()
    {
        //System.out.println("thread in execution");
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
            //to get the name of currently executing thread
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
             e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadEx1 obj=new ThreadEx1();
        Thread t=new Thread(obj);
        t.start();
        try
        {
            t.join();

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        Thread t1=new Thread(obj);
        t1.start();
        //System.out.println(t.getName());//o/p:-Thread-0
      //  System.out.println(t1.getName());
       // System.out.println("********");
    }
}
