package Project.Project3;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建对象
        Collection<String> c1 = new ArrayList<String>();

        //添加元素
        c1.add("math");
        c1.add("map");
        c1.add("may");

        //Interator<E> iterator(): 返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c1.iterator();//以多态的形式完成
        /*
            public Iterator<E> iterator() {
                return new Itr();
            }

            private class Itr implements Iterator<E> {...}
         */

        //E next(); 返回迭代中的下一个元素
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());//NOSuchElementException:表示被请求的元素不存在

        //boolean hasNext(): 如果迭代具有更多元素，则返回true
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
