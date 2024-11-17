package Net.OnlineChat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        // 启动接收线程
        new ClientReaderThread(socket).start();
        // 从socket管道中得到一个字节输出流，用来发送数据给服务端
        OutputStream os = socket.getOutputStream();
        // 将低级的字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);
        // 开始写数据
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        while (true) {
            System.out.println("Speaking to client...: ");
            String message = sc.nextLine();
            if (message.equals("exit"))
                break;
            dos.writeUTF(name + ":" + message);
        }

        dos.close();
        socket.close();
    }
}

