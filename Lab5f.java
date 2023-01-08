import java.util.*;

public class Lab5f {
    public static void main(String[] args) {
        String countries[] = new String[5];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 5 countries: ");
        for(int i = 0; i<5; i++){
            countries[i] = ob.next();
        }
        System.out.println("Names starting with N are : ");
        for(int i = 0; i<5; i++){
           if(countries[i].startsWith("N")){
               System.out.println(countries[i]);
           }
        }
    }
}
