import java.util.*;

class Person{
    private String name, address;
    private int age;

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public void showInfo(){
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
    }
}
public class ObjectConstructor {
    public static void main(String[] args) {
        Person p= new Person("Ram", "BKT", 20);
        p.showInfo();
        Person p1 = new Person("Shyam","KTM", 19);
        p1.showInfo();
    }
}
