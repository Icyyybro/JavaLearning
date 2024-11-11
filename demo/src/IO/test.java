package IO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class test {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("D:/CODE\\JAVA\\learning\\demo\\src\\IO\\input.txt");

        //必须将fileInputStream作为构造参数才能使用
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        //可以读取任意具体的类型数据
        //dataInputStream.readBoolean();
        dataInputStream.readInt();
        //dataInputStream.readUTF();
    }
}
