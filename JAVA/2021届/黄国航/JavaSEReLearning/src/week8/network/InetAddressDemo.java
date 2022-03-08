package week8.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("baidu.com");
        System.out.println(address.getHostName() + address.getHostAddress());
    }
}
