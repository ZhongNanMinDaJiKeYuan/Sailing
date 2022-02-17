package week8.tcp_demo_with_thread;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.137.1", 10011);

        BufferedReader br = new BufferedReader(new FileReader("JAVA/黄国航/JavaSEReLearning/src/week8/tcp_demo/ClientDemo.java"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        System.out.println("客户端发送完毕！");
        s.shutdownOutput();// 结束发送

        // 接收服务器反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器的反馈："+data);


/*        is.close();
        outputStream.close();*/
        br.close();
        s.close();

    }
}
