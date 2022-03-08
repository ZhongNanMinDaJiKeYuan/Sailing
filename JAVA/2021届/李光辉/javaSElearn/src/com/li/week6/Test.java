package com.li.week6;

public class Test {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFile();
        bufferedReader_.readFiles(1);

        BufferedReader_ buf2 = new BufferedReader_(new StringReader_());
        buf2.readString();
        buf2.readFile();

    }
}
