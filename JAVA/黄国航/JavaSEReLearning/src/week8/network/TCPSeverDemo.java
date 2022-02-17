package week8.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSeverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10011);

        Socket socket = ss.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        String data = new String(bys, 0, len);
        System.out.println(data);

        socket.close();
        ss.close();

    }
}
