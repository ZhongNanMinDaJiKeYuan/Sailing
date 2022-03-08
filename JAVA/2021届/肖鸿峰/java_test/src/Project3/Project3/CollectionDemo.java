package Project.Project3;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c1 = new ArrayList<String>();

        System.out.println(c1.add("apple"));
        System.out.println(c1.add("java"));

        System.out.println(c1);

        System.out.println(c1.isEmpty());
        c1.clear();

    }

}
