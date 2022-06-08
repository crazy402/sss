package day.Day21Demo.ThreadUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName Client
 * @Description //客户端
 * @Author crazy402
 * @Date 2022/6/8 15:59
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        // 连接服务器端口
        Socket socket = new Socket("127.0.0.1", 8888);

        // 准备读取上传的文件
        FileInputStream fis = new FileInputStream("D:\\Test\\test.jpg");

        // 将文件上传
        OutputStream sos = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int i = 0;
        while ((i = fis.read(bytes)) != -1) {
            sos.write(bytes, 0, i);
        }

        socket.shutdownOutput();

        // 读取服务器返回的数据
        InputStream sis = socket.getInputStream();

        int j = 0;
        byte[] bytes1 = new byte[1024];
        while ((j = sis.read(bytes1)) != -1) {
            System.out.println(new String(bytes1, 0, j));
        }

        //关闭资源
        sis.close();

        socket.close();


    }
}
