import java.util.*;

class Person{
    private String name, address;
    private int age;
    public void setInfo(String n, String add, int ag){
        name=n;
        address=add;
        age=ag;
    }
  
    public void showInfo(){
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
    }
}
public class Object1 {
    public static void main(String[] args) {
        Person p= new Person();
        p.setInfo("Gaurav", "BKT",20);
        p.showInfo();
    }
}
