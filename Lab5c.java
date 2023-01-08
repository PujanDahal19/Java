import java.util.*;
class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
public class Lab5c {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a = ob.nextDouble();
        double b = ob.nextDouble();
        double c = a/b;
        if(c < 0.0001){
            try{
                MyException m = new MyException("Very Small Result.");
                throw m;
            }catch(MyException ex){
                System.out.println(ex);
            }
        }else{
            System.out.println("Result is : "+ c);
        }
    }
}
