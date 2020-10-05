import java.util.Scanner;
// Create a Parent (A)
public class A {
    //Comparison between 2 words
    public static String stringCompare(String l1, String l2) {
        try {
            int result = l1.compareTo(l2);
            if (result == 0)
                return "The strings are the same";
            else
                return "The strings are different";
        }
        catch(Exception e) {
            System.out.println("Exception handled:");
            return "L1 is null";
        }
    }
    // Checks if a string length is greater than 4
    public static char lengthGreaterThanFour(){
        Scanner kb = new Scanner (System.in);
        String word;

        System.out.println("Enter a word: ");
        word = kb.nextLine();

        if (word.length() > 4) {
            System.out.println(word + " Is greater than 4");
        } else {
            for(int i=0; i<=word.length()-1; i++) {
                System.out.println(word.charAt(i));
            }
        }
        return 0;
    }
}
