package Samples;

/**
 * Created by expertzlab12 on 7/11/18.
 */
public class Book {
    String name;
    String id;
    int price;
    Author obj;

    public Book(String name, String id, int price, Author obj) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.obj = obj;
    }
    public void display()
    {
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("price:"+price);
    }
}
