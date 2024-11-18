package Reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test2Constructor {
    @Test
    public void testGetConstructors() {
        Class c = Cat.class;
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            System.out.println(constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws NoSuchMethodException {
        Class c = Cat.class;
        Constructor constructor = c.getConstructor(String.class, int.class);
        System.out.println(constructor.getName() + ": " + constructor.getParameterCount());
    }
}
