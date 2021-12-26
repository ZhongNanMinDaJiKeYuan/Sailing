package week5.e5_date;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s = "2021-12-08 00:37:05";
        Date date = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
    }
}
