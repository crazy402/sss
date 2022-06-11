package day.Day21Demo.ThreadUpload;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.Socket;
import java.util.Random;

/**
 * @ClassName MyRunable
 * @Description //TODO
 * @Author crazy402
 * @Date 2022/6/8 20:09
 * @Version 1.0
 **/
public class MyRunable implements Runnable{
    private Socket socket;

    public MyRunable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        FileOutputStream fos = null;

        try {
            // 创建字节输出流  接收数据
            InputStream sis = socket.getInputStream();

            //创建文件夹接收
            File fileDir = new File("D:\\Test1");

            if (!fileDir.exists()) {
                fileDir.mkdir();
            }


            // 文件名

            String fileName = "Test"+System.currentTimeMillis()+ new Random().nextInt(100000)+".jpg";



            // 用输出流接受客户端发出的数据
            fos = new FileOutputStream(new File(fileDir, fileName));
            int i = 0;
            byte[] bytes = new byte[1024];

            while ((i = sis.read(bytes)) != -1) {

                fos.write(bytes, 0, i);
            }



            // 向客户端返回数据
            OutputStream sos = socket.getOutputStream();
            sos.write("上传成功".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            IOUtils.closeQuietly(fos);
            IOUtils.closeQuietly(socket);
        }

    }
}
