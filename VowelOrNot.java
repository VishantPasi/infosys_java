import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if (s == "a" || s == "e" || s == "o" || s == "i" || s == "u")
            System.out.println("Vowel");
        
        
        else
            System.out.println("Not a Vowel");

        sc.close();
    }

}
