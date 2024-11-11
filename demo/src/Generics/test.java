package Generics;

public class test {
    public static void main(String[] args) {
        MyArraylist<String> myarraylist = new MyArraylist<>(4);
        myarraylist.set("abc", 0);
        myarraylist.set("def", 1);
        myarraylist.set("ghi", 2);
        for (int i = 0; i < myarraylist.getCapacity(); i++) {
            System.out.println(myarraylist.getitem(i) + '\n');
        }
    }
}
