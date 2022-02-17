package week8.udp_demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP接收数据
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(12345);
        System.out.println("接收到的数据：");
        for(;;){
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            ds.receive(dp);

            String data = new String(dp.getData(), 0, dp.getLength());

            System.out.println(data);
            if ("886".equals(data)){
                System.out.println("接收结束");
                break;
            }
        }
        ds.close();



    }
}
