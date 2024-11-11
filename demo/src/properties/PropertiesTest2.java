package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        System.out.println(properties);

        properties.load(new FileInputStream("demo\\src\\properties\\test.properties"));
        System.out.println(properties);

        properties.forEach((k, v) -> System.out.println(k + "=" + v));

        System.out.println(properties.getProperty("key1"));
    }
}
