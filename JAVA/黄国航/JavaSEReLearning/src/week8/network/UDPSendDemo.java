package week8.network;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte [] bys ="hello说你是谁".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("192.168.137.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys, length, address,port);

        ds.send(dp);
        ds.close();
    }
}
