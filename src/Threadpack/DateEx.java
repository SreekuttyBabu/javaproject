package Threadpack;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by expertzlab12 on 7/20/18.
 */
public class DateEx {
    public static void main(String[] args) {
        Date today;
        today = new Date();
        System.out.println(today.toString());
        SimpleDateFormat sdf;
        sdf=new SimpleDateFormat("dd/mm/yy");
        System.out.println(sdf.format(today));
    }
}
