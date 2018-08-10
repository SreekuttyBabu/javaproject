package modifiers;

/**
 * Created by expertzlab12 on 6/29/18.
 */
public class AccessModEx extends AccessMod {
    public static void main(String[] args) {
        AccessMod d=new AccessMod();
        d.studentname="abc";
        d.setStudentid(1);
        d.setMark(400);
        int a=d.getStudentid();
        System.out.println(a);
        System.out.println(d.getMark());
        System.out.println("student name:"+d.studentname);
    }
}
