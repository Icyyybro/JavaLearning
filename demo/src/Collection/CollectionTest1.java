package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        //1. add方法
        c.add("java1");
        c.add("java2");
        System.out.println(c);

        //2. clear方法
        c.clear();
        System.out.println(c);

        //3. isEmpty
        System.out.println(c.isEmpty());

        //4. size方法
        c.add("java1");
        c.add("java2");
        System.out.println(c.size());

        //5. contains方法(判断集合中是否含有此元素)
        System.out.println(c.contains("java1"));

        //6. remove方法(若有多个元素默认删除找到的第一个)
        System.out.println(c.remove("java2"));

        //7. toArray方法(将集合转换成数组)
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString((arr)));

        //8. 将一个集合的全部数据倒入到另一个集合
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2);
        System.out.println(c1);
    }
}
