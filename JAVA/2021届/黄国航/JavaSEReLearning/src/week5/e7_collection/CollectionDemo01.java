package week5.e7_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        // 创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();
// 添加元素
        c.add("h1");
        c.add("h2");
        System.out.println(c);
        Iterator<String> it = c.iterator();
        if(it.hasNext()) {
            System.out.println(it.next());
        }
        if(it.hasNext()) {
            System.out.println(it.next());
        }
        c.add("h3");
        if(it.hasNext()) {
            System.out.println(it.next());
            //Exception in thread "main" java.util.ConcurrentModificationException
            // ArrayList在迭代的时候如果同时对其进行修改就会抛出异常，
        }

    }
}
