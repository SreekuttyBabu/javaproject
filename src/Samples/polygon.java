package Samples;

/**
 * Created by expertzlab12 on 7/14/18.
 */
public class polygon {

    public void area() {
        System.out.println("calculating area");
    }
    public void area(int r) {
        System.out.println("area of circle"+3.14*r*r);
    }
    public void area(int length,int breadth) {
        System.out.println("area of rectangle"+length * breadth);
    }

    public static void main(String[] args) {
        polygon obj=new polygon();
        obj.area (5);
        obj.area(16,12);
    }

    }




