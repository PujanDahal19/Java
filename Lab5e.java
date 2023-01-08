import java.util.*;
public class Lab5e {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = ob.next();
        String rev = "";
        for(int i = word.length()- 1; i >=0; i--){
            rev = rev + word.charAt(i);
        }
        if(word.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
