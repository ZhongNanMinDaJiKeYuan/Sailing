package week8.functional_interface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        String s = getString(() -> "新串串");
        System.out.println(s);

        Integer i = getInteger(() -> 10);
        System.out.println(i);

    }
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }
    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
