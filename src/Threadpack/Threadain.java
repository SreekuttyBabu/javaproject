package Threadpack;

/**
 * Created by expertzlab12 on 7/17/18.
 */
public class Threadain extends Thread {
    Thread1Ex obj;


    public Threadain(Thread1Ex obj)
    {
        this.obj=obj;
    }
    public void run()
    {
      obj.display();
    }

    public static void main(String[] args) {
        Thread1Ex ex=new Thread1Ex(5);
        Thread1Ex ex1=new Thread1Ex(100);
        Threadain obj=new Threadain(ex);
        Threadain obj1=new Threadain(ex1);
        obj.start();
        obj1.start();
    }
}
