package week8.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiveDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds =new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        ds.receive(dp);

        byte[] datas = dp.getData();
        int len = dp.getLength();
        String dataString = new String(datas,0, len);
        System.out.println(dataString);
        ds.close();
    }
}
