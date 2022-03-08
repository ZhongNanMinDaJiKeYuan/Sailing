package week6.input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
复制文本文件到另一个文件
 */
public class CopyTextDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("JAVA\\黄国航\\JavaSEReLearning\\src\\week3\\StudentManager.java");
        FileOutputStream fos = new FileOutputStream("JAVA\\黄国航\\JavaSEReLearning\\src\\week6\\input_stream\\StudentManager.txt");
        int by;
        while( (by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
