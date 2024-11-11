package properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
        //创建Properties对象，往里加入一些字符串对象
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        properties.setProperty("key3", "value3");
        properties.store(new FileWriter("demo\\src\\properties\\test.properties"), "Nothing");
    }
}
