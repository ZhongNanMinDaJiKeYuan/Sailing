package week5.e4_number_in_string_sorting;

import java.util.Arrays;

/**
 * 对字符串中整数进行排序
 */
public class StringNumberSorting {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        String[] strArray = s.split(" ");

        int[] arr = new int[strArray.length];
        for (int i = 0; i< strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
