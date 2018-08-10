package RaughPack;


import java.rmi.*;
import java.rmi.server.*;

/**
 * Created by expertzlab12 on 8/6/18.
 */
public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote()throws RemoteException {
        super();
    }
    public  int add (int x,int y)
    {return x+y;}
}
