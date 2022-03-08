package week6.file;

import java.io.File;

/**
 * 需求:给定一个路径， 通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台
 */
public class FileDemo02 {
    public static void main(String[] args) {
        File srcFile = new File("JAVA/黄国航");
        getAllFilePath(srcFile);
    }
    public static void getAllFilePath(File srcFile) {
        File[] fileArray = srcFile.listFiles();
        if(fileArray != null){
            for (File file : fileArray) {
                if (file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }

    }
}
