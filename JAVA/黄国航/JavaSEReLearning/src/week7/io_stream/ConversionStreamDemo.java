package week7.io_stream;


import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("JAVA/黄国航/JavaSEReLearning/src/week7/out.txt"),"UTF-8");
        osw.write("中国");
        osw.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("JAVA/黄国航/JavaSEReLearning/src/week7/out.txt"), "UTF-8");
        int ch;
        while ( (ch = isr.read()) != -1) {
            System.out.println( (char)ch );
        }
        isr.close();
    }
}
