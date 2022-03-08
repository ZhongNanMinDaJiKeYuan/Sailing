package week8.tcp_demo_with_thread;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable{
    private Socket s;
    public ServerThread(Socket s){
        this.s = s;
    }
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            // 文件名冲突的一种思路
            int count = 0;
            File file = new File("JAVA/黄国航/JavaSEReLearning/src/week8/tcp_demo_with_thread/out"+ count +".txt");
            while (file.exists()){
                count++;
                file = new File("JAVA/黄国航/JavaSEReLearning/src/week8/tcp_demo_with_thread/out"+ count +".txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while((line = br.readLine())!= null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功! from "+Thread.currentThread().getName());
            bwServer.newLine();
            bwServer.flush();

            bw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
