class Person{
    private String name,address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}

class Employee extends Person{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
public class SI {
     public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Gaurav");
        e1.setAddress("Kathmandu");
        e1.setAge(23);
        e1.setSalary(16000);
        
        System.out.println("Name:"+e1.getName());
        System.out.println("Address:"+e1.getAddress());
        System.out.println("Age:"+e1.getAge());
        System.out.println("Salary:"+e1.getSalary());
        
        
    }
}
