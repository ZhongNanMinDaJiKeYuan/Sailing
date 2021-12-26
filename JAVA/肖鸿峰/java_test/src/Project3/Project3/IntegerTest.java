package Project.Project3;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        //把字符串中的数字存储到一个int类型数组中
        String[] strArray = s.split(" ");

        //定义一个int数组，把Sting[] 数组中的每一个元素存储到int数组中
        int[] arr = new int[strArray.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(arr);
    }
}
