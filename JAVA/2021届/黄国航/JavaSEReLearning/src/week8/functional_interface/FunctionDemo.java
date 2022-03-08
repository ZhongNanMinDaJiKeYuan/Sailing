package week8.functional_interface;

import java.util.function.Function;

/**
 * - `Function<T,R>`:常用的两个方法
 *   - `R apply(T t)`:将此函数应用于给定的参数
 *   - `default <V> Function andThen(Function after)`:返回一个组合函数,首先将该函数应用于输入,然后将 after 函数应用于结果
 * - `Function<T,R>`接口通常用于对参数进行处理，转换（处理逻辑由 Lambda 表达式实现）,然后返回一个新的值
 */
public class FunctionDemo {
    public static void main(String[] args) {
        // 把一个字符串转换int 类型,在控制台输出
        convert("100", Integer::parseInt);

        //把一个 int 类型的数据加上一个整数之后,转为字符串在控制台输出
        convert(100, i -> String.valueOf(i + 5));

        // 把一个字符串转换 int 类型,把 int 类型的数据加上一个整数之后,转为字符串在控制台输出
        convert("100", Integer::parseInt, i -> String.valueOf(i+5));
    }
    //定义一个方法,把一个字符串转换int 类型,在控制台输出
    private static void convert(String s, Function<String, Integer> fun){
        int i = fun.apply(s);
        System.out.println(i);
    }

    // 定义一个方法,把一个 int 类型的数据加上一个整数之后,转为字符串在控制台输出
    private static void convert(int i, Function<Integer, String> fun){
        String s = fun.apply(i);
        System.out.println(s);
    }

    // 定义一个方法,把一个字符串转换 int 类型,把 int 类型的数据加上一个整数之后,转为字符串在控制台输出
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2){
//        Integer i = fun1.apply(s);
//        String s1 = fun2.apply(i);
        // 与上两行相同效果
        String s1 = fun1.andThen(fun2).apply(s);
        System.out.println(s1);
    }
}
