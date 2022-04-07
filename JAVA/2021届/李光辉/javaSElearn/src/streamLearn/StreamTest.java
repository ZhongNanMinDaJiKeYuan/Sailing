package streamLearn;

import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamTest {

    /**
     * filter
     * >  * 功能描述:根据条件过滤集合数据
     * >  * @return : void
     * >
     */
    @Test
    public void filter() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        List<String> strings1 = strings.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
        System.out.println(strings1);
    }


    /**
     * distinct
     * 功能描述:去除集合中重复数据
     *
     * @return : void
     */


    @Test
    public void distinct() {
        List<String> strings = Arrays.asList("abc", "abc", "bc", "efg", "abcd", "jkl", "jkl");
        List<String> distincted = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(distincted);
    }


    /**
     * limit
     * >  * 功能描述:指定获取集合前x条数据，重新构造一个新的集合
     * >  * @return : void
     * >
     */
    @Test
    public void limit() {
        List<String> strings = Arrays.asList("abc", "abc", "bc", "efg", "abcd", "jkl", "jkl");
        List<String> limited = strings.stream().limit(3).collect(Collectors.toList());
        System.out.println(limited);

//        List<String> collect = strings.stream().limit(3).collect(Collectors.toList());
    }


    /**
     * skip
     * >  * 功能描述:排除集合前x条数据，把后面的数据重新构造一个新的集合
     * >  * @return : void
     * >
     */
    @Test
    public void skip() {
        List<String> strings = Arrays.asList("abc", "abc", "bc", "efg", "abcd", "jkl", "jkl");
        List<String> limited = strings.stream().skip(3).collect(Collectors.toList());
        System.out.println(limited);

    }


    /**
     * map
     * >  * 功能描述:对集合中所有元素统一处理
     * >  * @return : void
     * >
     */
    @Test
    public void map() {
        List<String> strings = Arrays.asList("abc", "abc", "bc", "efg", "abcd", "jkl", "jkl");
        List<String> collect = strings.stream().map(s -> s + "_li").collect(Collectors.toList());
        System.out.println(collect);
    }


    /**
     * flatMap
     * >  * 功能描述:对集合中所有元素统一处理(会将所有流汇成一个流)
     * >  * @return : void
     * >
     * <p>
     * map与flatMap的区别：
     * 1.返回内容不同
     * map返回一个流，包含给定函数应用在流中每一个元素后的结果
     * flatMap返回一个流，包含将此流中的每个元素替换为通过给定函数映射应用于每个元素而生成的映射流的内容
     * 举例说明
     * 有二箱鸡蛋，每箱5个，现在要把鸡蛋加工成煎蛋，然后分给学生。
     * map做的事情：把二箱鸡蛋分别加工成煎蛋，还是放成原来的两箱，分给2组学生；
     * flatMap做的事情：把二箱鸡蛋分别加工成煎蛋，然后放到一起【10个煎蛋】，分给10个学生；
     */
    @Test
    public void flatMap() {
        List<String> strings = Arrays.asList("abc", "abc", "bc", "efg", "abcd", "jkl", "jkl");
        List<String> collect = strings.stream().flatMap(s -> Arrays.asList(s.split("c")).stream()).collect(Collectors.toList());
        List<List<String>> collect2 = strings.stream().map(s -> Arrays.asList(s.split("c"))).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect2);

    }


    /**
     * sorted
     * 功能描述 : 对集合进行排序
     *
     * @return : void
     */
    @Test
    public void sorted() {
        List<String> strings1 = Arrays.asList("abc", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        List<String> strings2 = Arrays.asList("张三", "李四", "王五", "赵柳", "张哥", "李哥", "王哥");
        List<Integer> strings3 = Arrays.asList(10, 2, 30, 22, 1, 0, -9);
        List<String> sorted1 = strings1.stream().sorted().collect(Collectors.toList());
        List<String> sorted2 = strings2.stream().sorted(Collections.reverseOrder(Collator.getInstance(Locale.CHINA))).collect(Collectors.toList());
        List<Integer> sorted3 = strings3.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted1);
        System.out.println(sorted2);
        System.out.println(sorted3);

    }


    /*
     * anyMatch
     * 功能描述 : 判断集合中是否至少存在一个元素满足条件
     * @return : void
     * */
    @Test
    public void anyMatch() {
        List<String> strings = Arrays.asList("abc", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        boolean b = strings.stream().anyMatch(s -> s == "abc");
        System.out.println(b);
    }


    /*
     * allMatch
     * 功能描述 : 判断集合中是否所有元素都满足条件
     * @return : void
     * */
    @Test
    public void allMatch() {
        List<String> strings = Arrays.asList("abc", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        boolean b = strings.stream().allMatch(s -> s == "abc");
        System.out.println(b);
    }


    /*
     * noneMatch
     * 功能描述 : 判断集合中是否所有元素都不满足条件
     * @return : void
     * */
    @Test
    public void noneMatch() {
        List<String> strings = Arrays.asList("abc", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        boolean b = strings.stream().noneMatch(s -> s == "abc");
        System.out.println(b);
    }


    /*
     * findAny
     * 功能描述 : 返回当前流中任意元素
     * @return : void
     * */
    @Test
    public void findAny() {
        List<String> strings = Arrays.asList("abc", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        Optional<String> any = strings.stream().findAny();
        System.out.println(any);
    }


    /*
     * findFirst
     * 功能描述 : 返回当前流中第一个元素
     * @return : void
     * */
    @Test
    public void findFirst() {
        List<String> strings = Arrays.asList("abc", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        Optional<String> any = strings.stream().findAny();
        System.out.println(any);
    }


    /*
     * forEach
     * 功能描述 : 遍历流
     * @return : void
     * */
    @Test
    public void forEach() {
        List<String> strings = Arrays.asList("cv", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        strings.stream().forEach(s -> System.out.println(s));
    }


    /**
     * >  * 功能描述 : 流转换为其他形式
     * >  * @return : void
     * >
     */
    @Test
    public void collect() {
        List<String> strings = Arrays.asList("cv", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        Set<String> set = strings.stream().collect(Collectors.toSet());
        List<String> list = strings.stream().collect(Collectors.toList());
//        toMap(key,value,重复时(oldValue，newValue) ->(选择的value))
        Map<String, String> map = strings.stream().collect(Collectors.toMap(v -> v.concat("_name"), v1 -> v1, (v1, v2) -> v1));
        System.out.println(set);
        System.out.println(list);
        System.out.println(map);
    }


    /**
     * reduce
     * >  * 功能描述 : 将流中元素反复结合起来，得到一个值
     * >  * @return : void
     * >
     */
    @Test
    public void reduce() {
        List<String> strings = Arrays.asList("cv", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        //reduce方法一
        Optional<String> reduce1 = strings.stream().reduce((acc, item) -> {
            return acc + item;
        });
        //reduce方法二
        String reduce2 = strings.stream().reduce("itcast", (acc, item) -> {
            return acc + item;
        });
        //reduce方法三
        ArrayList<String> reduce3 = strings.stream().reduce(
                new ArrayList<String>(),
                new BiFunction<ArrayList<String>, String, ArrayList<String>>() {
                    @Override
                    public ArrayList<String> apply(ArrayList<String> acc, String item) {
                        acc.add(item);
                        return acc;
                    }
                },
                new BinaryOperator<ArrayList<String>>() {
                    @Override
                    public ArrayList<String> apply(ArrayList<String> acc, ArrayList<String> item) {
                        return acc;
                    }
                }
        );
        if (reduce1.isPresent())
            System.out.println(reduce1.get());
        System.out.println(reduce2);
        System.out.println(reduce3);
    }

    /**
     * count
     * > * 功能描述 : 返回流中元素总数
     * > * @return : void
     * >
     */
    @Test
    public void count() {
        List<String> strings = Arrays.asList("cv", "abd", "aba", "efg", "abcd", "jkl", "jkl");
        long count = strings.stream().count();
        System.out.println(count);
    }
}
