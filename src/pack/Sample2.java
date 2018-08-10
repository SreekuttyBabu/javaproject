package pack;

import first.Firstinterface;

/**
 * Created by expertzlab12 on 6/29/18.
 */
public class Sample2 {
    //we can implement interface and abstract without using "extends " key word
    public static void main(String[] args) {
        Firstinterface f=new Firstinterface() {
            @Override
            public void display() {
                System.out.println("hello");
            }

            @Override
            public int add(int x, int y) {
                return x+y;

            }
        };
        f.display();
        System.out.println(f.add(3,5));
    }
}
