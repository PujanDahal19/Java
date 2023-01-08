import java.util.*;
public class Lab5g {
    public static void main(String[] args) {
        String countries[] = new String[5];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 5 countries: ");
        for(int i = 0; i<5; i++){
            countries[i] = ob.next();
        }
        String temp;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (countries[i].compareTo(countries[j]) > 0) {
                    
                    temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        
        System.out.println("Numbers in Ascending order are: ");
        for(int i = 0; i<5; i++){
            System.out.println(countries[i]);
        }
    }
}
