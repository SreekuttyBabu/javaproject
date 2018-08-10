package RaughPack;

import java.rmi.*;

/**
 * Created by expertzlab12 on 8/6/18.
 */
public class MyServerr {
    public static void main(String[] args) {
        try{
            Adder stub=new AdderRemote();
            Naming.rebind("rmi://localhost:5000/sono",stub);
        }
        catch(Exception e){}
    }
}
