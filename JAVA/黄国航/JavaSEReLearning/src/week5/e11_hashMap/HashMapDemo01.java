package week5.e11_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 需求：创建一个 HashMap 集合，键是学生对象（Student),值是居住地（String)。存储多个键值对元素，并遍历。
 * 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
 */

public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<Student, String>();
        //创建学生对象
        Student s1 = new Student("李木", 12);
        Student s2 = new Student("张工", 12);
        Student s3 = new Student("田四", 14);
        Student s4 = new Student("田四", 14);

        // 添加到集合
        hm.put(s1, "西安");
        hm.put(s2, "武汉");
        hm.put(s3, "上海");
        hm.put(s4, "江西");

        // 遍历
        Set<Student> keySet = hm.keySet();
        for (Student s : keySet) {
            String value = hm.get(s);
            System.out.println(s+"的住址:"+ value);
        }
        System.out.println("-------------");
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> me : entries) {
            System.out.println(me.getKey()+"的住址:"+me.getValue());
        }
    }
}
