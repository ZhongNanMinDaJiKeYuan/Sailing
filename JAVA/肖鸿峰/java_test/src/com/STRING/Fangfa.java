package com.STRING;




/*
public String(), 创建空字符串，不含有任何内容
public String(char[] chs) 根据字符数组的内容来创建字符串对象
public Stirng(byte[] bys) 根据字节数组的内容来创建字符串对象
String s = "abc"; 直接赋值创建字符串对象，内容为adc
推荐使用直接赋值法

public char charAT(int index): 返回指定索引处的char值，索引从零开始
public int length(): 返回此字符串的长度
字符串长度： 字符对象.lengtha()

对于字符串有大写字母，小写字母以及数字大写字母：
ch >= 'A' && ch <= 'Z'
小写字母： ch >= 'a' && ch <= 'z'
数字： ch >= '0' && ch <= '9'

字符串拼接：
字符串反转：

StringBuilder:
public StringBuilder(); 创建一个空白可变字符串对象，不含有任何内容
StringBuilder str = new StringBuilder("hello");
public StringBuilder(String str);
 */
public class Fangfa {
    public static void main(String[] args) {


        char[] chs = {'a', 'b', 'c'};

        //每次new会给不同的地址
        String s1 = new String(chs);
        String s2 = new String(chs);
        String s = "1232456789";

        //字符串比较.用equal()方法

        //遍历字符串：
        for(int i=0; i<s.length(); i++) {
            s1.charAt(i);
        }

    }
}
