package week6.input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
复制指定路径下的图片
 */
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("JAVA\\黄国航\\JavaSEReLearning\\src\\week6\\input_stream\\test.png");
        FileOutputStream fos = new FileOutputStream("JAVA\\黄国航\\JavaSEReLearning\\src\\week6\\input_stream\\out.png");

        byte[] bys = new byte[1024];
        int len;
        while ( (len = fis.read(bys)) != -1){
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();

    }
}
