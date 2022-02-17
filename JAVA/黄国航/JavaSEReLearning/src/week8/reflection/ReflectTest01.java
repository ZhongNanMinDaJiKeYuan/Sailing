package week8.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 有一个 ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据
 */
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(10);
        Class<? extends ArrayList> c = array.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(array, "hello");
        add.invoke(array, "world");
        add.invoke(array, "java");

        System.out.println(array);
    }
}
