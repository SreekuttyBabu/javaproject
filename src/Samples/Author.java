package Samples;

/**
 * Created by expertzlab12 on 7/11/18.
 */
public class Author {
    int age;
    String name;
    int number ;

    public Author(int age, String name, int number) {
        this.age = age;
        this.name = name;
        this.number = number;
    }
    public void display()
    {
        System.out.println("age:"+age);
        System.out.println("name:"+name);
        System.out.println("number:"+number);
    }
}
