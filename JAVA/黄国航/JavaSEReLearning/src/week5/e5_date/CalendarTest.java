package week5.e5_date;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 二月天数
 */
public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);// 设置为当年的三月一日
        c.add(Calendar.DATE, -1);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年的2月份有"+date+"天");
    }
}
