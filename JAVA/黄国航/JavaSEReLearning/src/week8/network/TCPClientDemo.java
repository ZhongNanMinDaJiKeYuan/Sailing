package week8.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.137.1", 10011);

        OutputStream os = s.getOutputStream();
        os.write("hello,tcp".getBytes());

        s.close();

    }
}
