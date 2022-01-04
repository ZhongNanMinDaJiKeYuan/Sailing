package week7.io_stream;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        // 数据源
        File srcFile = new File("JAVA/黄国航/JavaSEReLearning/src");
        File destFile = new File("G:\\test");
        copyFolder(srcFile, destFile);
    }

    // 复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        // 是否目录
        if(srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) { // 目标目录不存在
                boolean isCreated = newFolder.mkdirs();

                System.out.println("复制目录"+ isCreated+": "+ newFolder);
            }

            File[] fileArray = srcFile.listFiles();

            for (File file : fileArray) {
                copyFolder(file, newFolder); // 对目录下的文件和目录递归
            }
        }else{ // 是文件
                File newFile = new File(destFile, srcFile.getName());
                copyFile(srcFile, newFile);
                System.out.println("复制了文件："+ newFile);
        }
    }

    // 字节流缓冲流复制文件
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ( (len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();

    }
}
