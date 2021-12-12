package week5.e8_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("zz");
        set.add("hh");
        set.add("gg");
        set.add("hh");// 不会存储重复元素
        set.add("ee");

        // 遍历
        for(String s : set){
            System.out.println(s);
        }
        System.out.println(set);
    }
}
