package Net.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        // 注册端口
        DatagramSocket socket = new DatagramSocket(9000);
        // 创建数据包对象,用于接收数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(new byte[1024], buf.length);
        // 使用数据包接收数据
        socket.receive(packet);
        int len = packet.getLength();
        String str = new String(packet.getData(), 0, len);
        System.out.println(str);
    }
}
