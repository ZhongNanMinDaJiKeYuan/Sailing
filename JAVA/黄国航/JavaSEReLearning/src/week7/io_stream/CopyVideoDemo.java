package week7.io_stream;

import java.io.*;

/**
 * 四种方式复制一个视频G:\\test.mp4：
 * 四种方式实现复制视频,并记录每种方式复制视频的时间
 * 1:基本字节流一次读写一个字节         共耗时：250241毫秒
 * 2:基本字节流一次读写一个字节数组       共耗时：304毫秒
 * 3:字节缓冲流一次读写一个字节         共耗时：1442毫秒
 * 4:字节缓冲流一次读写一个字节数组        共耗时：83毫秒
 */

public class CopyVideoDemo {
    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        //method1();
//         method2();
//        method3();
        method4();
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }

    // 基本字节流一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("G:\\test.mp4");
        FileOutputStream fos = new FileOutputStream("G:\\output.mp4");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }

    // 基本字节流一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("G:\\test.mp4");
        FileOutputStream fos = new FileOutputStream("G:\\output.mp4");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fis.close();
        fos.close();
    }

    // 字节缓冲流一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:\\test.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\output.mp4"));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bis.close();
        bos.close();

    }

    // 字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:\\test.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\output.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bis.close();
        bos.close();

    }


}
