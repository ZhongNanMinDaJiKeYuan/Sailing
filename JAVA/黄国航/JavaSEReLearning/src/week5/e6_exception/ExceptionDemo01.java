package week5.e6_exception;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            // 出现异常后，try子块中将会停在出现异常的位置
            System.out.println("不能继续");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你访问的数组的索引不存在");
        }


    }
}