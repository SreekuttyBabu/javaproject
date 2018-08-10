package RaughPack;

import java.rmi.*;

/**
 * Created by expertzlab12 on 8/6/18.
 */
public class Myclientt {
    public static void main(String[] args) {
        try{
            Adder stub=(Adder) Naming.lookup("rmi://localhost:5000/sono");
            System.out.println(stub.add(34,4));
        }
        catch(Exception e){}
    }
}
