package week8.functional_interface;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello" , s -> s.length()>8 );
        System.out.println(b1);

        boolean b3 = checkString("hello", s -> s.length()>8, s -> s.length()>15);
    }
    // 同一个字符串给出两个不同的判断条件，最后把这两个结果做逻辑与运算的结果作为最终结果
    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre2.test(s);
//        boolean b3 = b1 && b2;
//        return b3;
        // 与上面结果相同
        return pre1.and(pre2).test(s);// 逻辑与
         //return pre1.or(pre2).test(s);// 逻辑或
    }

    // 判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre){
         return pre.test(s);
        // 逻辑非
        //return pre.negate().test(s);
    }

}
