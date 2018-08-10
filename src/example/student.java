package example;

/**
 * Created by expertzlab12 on 6/21/18.
 */
public class student {
    int rollno;
    String name;

    student(int rollno,String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void main(String[] args) {
        student s=new student();
        student s1=new student(1,"anu");//parameterized constructer
        System.out.println(s.rollno+""+s.name);
        System.out.println(s1.rollno+""+s1.name);
    }
    }

