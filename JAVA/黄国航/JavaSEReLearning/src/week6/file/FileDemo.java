package week6.file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("D:\\java\\test.txt");
        System.out.println(f1);
        File f2 = new File("D:\\java", "test.txt");
        System.out.println(f2);
        File f3 = new File("D:\\java");
        File f4 = new File(f3, "test.txt");
        System.out.println(f4);

    }
}
