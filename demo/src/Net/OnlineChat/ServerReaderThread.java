package Net.OnlineChat;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Server.onLineSockets.add(socket);
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                    // 把消息分发给全部客户端
                    sendMsgToAll(msg);
                } catch (IOException e) {
                    String msg = "logout: " + socket.getRemoteSocketAddress();
                    System.out.println(msg);
                    Server.onLineSockets.remove(socket);
                    sendMsgToAll(msg);
                    is.close();
                    dis.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void sendMsgToAll(String msg) throws IOException {
        for (Socket onLineSocket : Server.onLineSockets) {
            OutputStream os = onLineSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
