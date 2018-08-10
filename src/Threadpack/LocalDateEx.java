package Threadpack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by expertzlab12 on 7/20/18.
 */
public class LocalDateEx {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis());
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}
