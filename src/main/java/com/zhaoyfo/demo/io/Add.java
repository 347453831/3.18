package com.zhaoyfo.demo.io;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Add {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);//1024-65535的某个端口

        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String info = null;
        while ((info = br.readLine()) != null) {
            System.out.println("我是服务器，客户端说：" + info);
        }
        socket.shutdownInput();//关闭输入流
        //4、获取输出流，响应客户端的请求
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write("欢迎您！");
        pw.flush();
        //5、关闭资源
         pw.close();
         os.close();
         br.close();
         isr.close();
         is.close();
         socket.close();
         serverSocket.close();
    }

}
