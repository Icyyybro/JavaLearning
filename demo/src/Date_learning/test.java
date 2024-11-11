package Date_learning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        Date date_ex = new Date();
        System.out.println(date_ex);

        String date_str = "2024年11月2日 22:01:53";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        date = sdf.parse(date_str);
        System.out.println(date);
    }
}
