package RaughPack;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Created by expertzlab12 on 8/6/18.
 */
public class MyClient {
    public static void main(String[] args){
        try{
            Socket s=new Socket("Localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();}
            catch(Exception e) {
            System.out.println(e);}}}
