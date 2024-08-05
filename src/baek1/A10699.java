package baek1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class A10699 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        System.out.println(dateFormat.format(date));
    }
}
