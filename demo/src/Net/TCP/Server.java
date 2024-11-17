package Net.TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建服务端对象，同时注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        // 使用serversocket对象，调用一个accept方法，等待客户端的连接请求
        Socket socket = serverSocket.accept();
        //读入一个字节输入流
        InputStream is = socket.getInputStream();
        //将字节输入流转换成数据输入流
        DataInputStream dis = new DataInputStream(is);
        String rs = dis.readUTF();
        System.out.println(rs);
        System.out.println(socket.getRemoteSocketAddress());

    }

}
