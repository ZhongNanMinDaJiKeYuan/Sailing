package week5.e3_bubble_sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {45,38, 60, 17, 89,10};
        printArr(arr);
        for(int x = 0; x < arr.length-1; x++){
            for(int i = 0; i < arr.length-1-x; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        Arrays.toString(arr);
        printArr(arr);
        int a = Integer.parseInt("2");
    }
    public static void printArr(int[] arr){
        System.out.print('[');
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println(']');
    }
}
