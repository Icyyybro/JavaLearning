package Net.OnlineChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> onLineSockets = new ArrayList<Socket>();

    public static void main(String[] args) throws IOException {
        // 创建服务端对象，同时注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            // 使用serversocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();
            // 如果接收到一个客户端，启动线程
            new ServerReaderThread(socket).start();
        }
    }
}
