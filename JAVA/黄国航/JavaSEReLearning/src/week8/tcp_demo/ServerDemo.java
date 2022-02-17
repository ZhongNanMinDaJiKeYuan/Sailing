package week8.tcp_demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10011);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务器："+ data);

        // 给出反馈
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("数据已收到".getBytes());

        serverSocket.close();


    }
}
