import java.util.*;
public class Lab5d {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a word:");
        String alpha = ob.next();
        String beta = alpha.toLowerCase();
        for(int i = 0; i < alpha.length(); i++){
            char ch = beta.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Total no. of vowels is : "+ count);
    }
}
