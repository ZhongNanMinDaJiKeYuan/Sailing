package week8.functional_interface;

import java.util.function.Consumer;

/**
 * - `Consumer<T>`:包含两个方法
 *   - `void accept(T t)`:对给定的参数执行此操作
 *   - `default consumer<T> andThen( Consumer after)`:返回一个组合的 Consumer，依次执行此操作，然后执行 after 操作
 * - `Consumer<T>`接口也被称为消费型接口，它消费的数据的数据类型由泛型指定
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        // Lambda表达式
        operatorString("字符串", s -> System.out.println(s));
        // 方法引用实现同样
        operatorString("字符串", System.out::println);
        operatorString("字符串", System.out::println, s -> System.out.println(s.charAt(0)));
    }
    // 用不同的方式消费同一个字符串两次
    private static void operatorString(String name, Consumer<String> consumer1, Consumer<String> consumer2){
        consumer1.accept(name);
        consumer2.accept(name);
        // 上面两句与下面一句同样
        consumer1.andThen(consumer2).accept(name);
    }

    // 消费一个字符串数据
    private static void operatorString(String name, Consumer<String> consumer){
        consumer.accept(name);
    }
}
