package week8.tcp_demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.137.1", 10011);

        // 获取输入流，写数据
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("hello,tcp".getBytes());
        s.shutdownOutput();
        // 接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("客户端："+ data);

/*        is.close();
        outputStream.close();*/
        s.close();

    }
}
