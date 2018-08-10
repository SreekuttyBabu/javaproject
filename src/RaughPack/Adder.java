package RaughPack;
import java.rmi.*;
//import java.rmi.Remote;
//import java.rmi.RemoteException;

/**
 * Created by expertzlab12 on 8/6/18.
 */
        public interface Adder extends Remote {
            public int add(int x,int y)throws RemoteException;
        }

