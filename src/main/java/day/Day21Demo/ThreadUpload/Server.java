package day.Day21Demo.ThreadUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @ClassName Server
 * @Description //服务端
 * @Author crazy402
 * @Date 2022/6/8 15:59
 * @Version 1.0
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        // 创建服务器对象 开放端口  和 创建socket等待连接
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket socket = serverSocket.accept();
            MyRunable myRunable = new MyRunable(socket);
            new Thread(myRunable).start();
        }







    }
}
