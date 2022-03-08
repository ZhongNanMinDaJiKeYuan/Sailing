package Project.Project3;

import java.util.ArrayList;
import java.util.List;

public class Fordemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i: arr) {
            System.out.println(i);
        }

        String[] strArray = {"hello", "world"};
        System.out.println("-------------------------");

        for(String s : strArray) {
            System.out.println(s);
        }

        System.out.println("-------------------------");

        List<String> list = new ArrayList<String>();
        list.add("hallo");
        list.add("hello");
        list.add("hillo");

        for(String s : list) {
            if(s.equals("hello")) {
                list.add("hollo");
            }//若抛出并发修改异常，则说明内部是Iterator。
            System.out.println(s);
        }
    }
}
