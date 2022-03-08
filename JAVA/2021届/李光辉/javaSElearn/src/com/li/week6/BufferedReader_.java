package com.li.week6;

public class BufferedReader_ extends Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    @Override
    public void readString() {
        reader_.readString();
    }

    @Override
    public void readFile() {
        reader_.readFile();
    }

    public void readFiles(int i) {
        while (i > 0) {
            reader_.readFile();
            i--;
        }
    }
}
