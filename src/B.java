
// Create a new class (B) that inherits from Parent (A) class. AND // Implement the interface in Class (B)
public class B extends A implements myInterface{
    // Use functionality from (A) in a new method from (B).
    public static String newStringCompare(String l1, String l3) {
        int result = l1.compareTo(l3);
        if (result == 0)
            return "B Method: The strings are the same";
        else
            return "B Method: The strings are different";
    }
    // Functionality: Print "Hello Interface"
    public void sayHello() {
        System.out.println("Hello Interface");
    }
}
