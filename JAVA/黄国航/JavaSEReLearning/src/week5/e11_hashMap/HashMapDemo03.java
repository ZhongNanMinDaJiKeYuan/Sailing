package week5.e11_hashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/**
 * 需求：键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
 * 举例：键盘录入"aababcabcdabcde"在控制台输出：“a(5)b(4)c(3)d(2)e(1)"
 */
public class HashMapDemo03 {
    public static void main(String[] args) {
        String input = "aababcabcdabcde";
        // HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();
        // TreeMap会对键进行排序
        for (int i = 0; i < input.length(); i++){
            char key = input.charAt(i);
            Integer value = hm.get(key);
            if (value==null) {
                hm.put(key, 1);
            }else {
                hm.put(key, ++value);
            }
        }
        Set<Character> keys = hm.keySet();
        for (Character c : keys) {
            int value = hm.get(c);
            System.out.println(c + " : " + value);
        }

    }
}
