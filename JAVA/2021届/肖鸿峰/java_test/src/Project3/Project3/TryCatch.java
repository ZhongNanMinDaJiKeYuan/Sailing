package Project.Project3;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你访问的数组索引不存在");
        }

    }
}
