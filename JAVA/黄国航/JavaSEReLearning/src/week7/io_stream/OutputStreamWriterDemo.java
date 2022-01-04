package week7.io_stream;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("JAVA/黄国航/JavaSEReLearning/src/week7/out.txt"));
        osw.write(97);
        osw.flush();// 刷新流
        char[] chars = {'a','b', 'c', 'd', 'e'};
        osw.write(chars);
        osw.flush();// 刷新流
        osw.write(chars, 1, chars.length-2);
        osw.write("\nabcde");
        osw.write("\nabcde",0,3);
        osw.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("test\\out.txt"));
        bw.write("hello\r\n");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("test\\out.txt"));
        int ch;
        while( (ch = br.read()) != -1) {
            System.out.println( (char)ch );
        }
        br.close();
    }
}
