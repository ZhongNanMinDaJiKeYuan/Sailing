package week5.e11_hashMap;

import java.util.*;

/**
 * 创建1个 ArrayList 集合,存储三个元素,每一个元素都是 Hash Map,每一个 HashMap 的键和值都是 String,并遍历
 */
public class HashMapDemo02 {
    public static void main(String[] args) {
        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        HashMap<String , String > hm1 = new HashMap<String, String>();
        hm1.put("001", "100");
        hm1.put("002", "200");
        hm1.put("003", "100");


        HashMap<String , String > hm2 = new HashMap<String, String>();
        hm2.put("101", "100");
        hm2.put("002", "200");
        hm2.put("003", "100");
        HashMap<String , String > hm3 = new HashMap<String, String>();
        hm3.put("101", "100");
        hm3.put("002", "200");
        hm3.put("003", "100");

        list.add(hm1);
        list.add(hm2);
        list.add(hm3);

        for (HashMap<String, String> hm : list){
            Set<String> strings = hm.keySet();
            for (String key: strings){
                String value = hm.get(key);
                System.out.println(key+", "+ value);
            }
        }

    }

}
