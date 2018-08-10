package first;

import modifiers.AccessMod;

/**
 * Created by expertzlab12 on 6/29/18.
 */
public class Test1 extends AccessMod {
    public static void main(String[] args) {
        //AccessMod d=new AccessMod();
        //in case of different package
        //we can access the main clss variables by using child class object
        //here  we cannot access the variables by using child class object
        Test1 v=new Test1();
        v.studentname="abc";
        v.display();
        System.out.println(v.studentname);

    }
}
