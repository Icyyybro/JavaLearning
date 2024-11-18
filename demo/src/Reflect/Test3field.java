package Reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class Test3field {
    @Test
    public void testGetFields() throws NoSuchFieldException, IllegalAccessException {
        Class c = Cat.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ": " + field.getType());
        }

        Field fname = c.getDeclaredField("name");
        System.out.println(fname.getName() + ": " + fname.getType());

        //可以为类的实例化对象中的私有成员变量赋值
        Cat cat = new Cat();
        fname.setAccessible(true);      //禁止访问控制权限
        fname.set(cat, "coffeecat");
        System.out.println(cat);
    }
}
