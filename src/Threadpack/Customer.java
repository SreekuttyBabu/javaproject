package Threadpack;

/**
 * Created by expertzlab12 on 7/19/18.
 */
public class Customer {
    int amount=10000;
    synchronized  void withdraw(int amount) {
        System.out.println("going to withdraw....");
        if (this.amount < amount) {
            System.out.println("less balance;waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount = amount;
        System.out.println("withdraw completed...");
    }
    synchronized  void deposit(int amount) {
        System.out.println("going to deposit...");
        this.amount = amount;
        System.out.println("deposit completed");
        //notify();
    }
    public static class  Thread1 extends Thread {
        Customer c;

        Thread1(Customer c) {
            this.c = c;

        }

        public void run() {
            c.withdraw(15000);
        }
    }
    public static class Thread2 extends Thread
    {
        Customer c;
        Thread2(Customer c)
        {
            this.c=c;
        }
        public void run()
        {
            c.deposit(10000);
        }
    }
    public static class Test
    {
        public static void main(String[] args) {
            Customer obj=new Customer();
            Thread1 t1 = new Thread1(obj);
            Thread2 t6 = new Thread2(obj);
            t1.start();
            t6.start();
        }
    }
}//notify all koduthal wait cheyyunna ella threads m execute avum
