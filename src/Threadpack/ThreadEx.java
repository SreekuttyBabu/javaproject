package Threadpack;

/**
 * Created by expertzlab12 on 7/17/18.
 */
public class ThreadEx extends Thread {
    public void run()
    {
        System.out.println("Thread in execution");
    }

    public static void main(String[] args) {
        ThreadEx t=new ThreadEx();
        t.start();
        System.out.println("********");
    }
}
