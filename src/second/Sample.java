package second;

/**
 * Created by expertzlab12 on 6/28/18.
 *///it provide 0 to 100 abstraction
public  abstract class Sample {//we can declare abstract and non abstract methods in abstract clss
    abstract int add(int x,int y);
    public abstract void display();
    abstract String details();
    public void show()
    {
        System.out.println("hello world");
    }
}
