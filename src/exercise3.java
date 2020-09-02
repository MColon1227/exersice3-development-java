import java.util.*;
import java.util.stream.Collectors;

public class exercise3 {
    // Create a Parent (A)
    static abstract class A {
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
            String word = "";

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

    // Create a new class (B) that inherits from Parent (A) class. AND // Implement the interface in Class (B)
    static class B extends A implements myInterface {
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

    // Create a method that orders by desc and asc order based on a parameter.
    public static List<String> sortList(List<String> valueList) {

        List<String> sortedList = valueList.stream().sorted().collect(Collectors.toList());
        for (String s : sortedList) {
            System.out.println(s);
        }

        sortedList = valueList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return sortedList;
    }

    //Create a method that removes null values
    public static List<String> removesNull(List<String> valueList){
        List<String> newList = new ArrayList<>();
        for(String s : valueList) {
            if(s != null && s.length() > 0) {
                newList.add(s);
            }
        }
        return newList;
    }

    //Method to Remove duplicates numbers--------->
    public static Set<Integer> removeDuplicates(List<Integer> numberList){
        Set<Integer> set = new HashSet<>(numberList);
        return set;
    }
    //Create a method that gives the missing number in 1 - 10
    public static Set<Integer> getMissingNo(Set<Integer> numberSet) {
        Set<Integer> missingNumbers = new HashSet<>();
        for (int i=1; i <= 10; i++) {
            if (!numberSet.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    public static void main(String[] args) {
        System.out.println("<---------//Comparison between 2 words --------->");
        String l1 = "'Exercise 3 of JAVA development'";
        String l2 = "'Marisol'";
        System.out.println("Comparing " + l1 + " " + "and " + l2 + " " + "= " + A.stringCompare(l1, l2));
        System.out.println();

        System.out.println("<---------//Checks if a string length is greater than 4 --------->");
        System.out.println(A.lengthGreaterThanFour());
        System.out.println();

        System.out.println("<---------//Use functionality from (A) in a new method from (B)--------->");
        String l3 = "'Exercise 3 of JAVA development'";
        System.out.println("Comparing " + l1 + " " + "and " + l3 + " " + "= " + B.newStringCompare(l1, l3));
        System.out.println();

        System.out.println("<---------//Implement the interface in Class (B) Functionality: Print \"Hello Interface\"--------->");
        B hello = new B();
        hello.sayHello();
        System.out.println();

        System.out.println("<---------//Create a method that orders by desc and asc order based on a parameter.--------->");
        List<String> valueList = null;
        try {
            valueList = Arrays.asList(
                    "Text",
                    "Baseball",
                    "Automation",
                    "Java",
                    "Laptop",
                    null);
            List<String> sortedList = sortList(valueList);
            sortedList.forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
        System.out.println();

        System.out.println("<---------//Create a method that removes null values.--------->");
        List<String> filteredList = removesNull(valueList);
        filteredList.forEach(System.out::println);
        System.out.println();

        //Remove duplicates numbers--------->
        List<Integer> list = Arrays.asList(2,2,3,4,4,5,6,7,8,10);
        Set<Integer> numberSet = removeDuplicates(list);
        System.out.println("<---------//Create a method that gives the missing number in 1 - 10.--------->");
        Set<Integer> missingNumbers = getMissingNo(numberSet);
        for(int number : missingNumbers){
            System.out.println("Missing number is: " + number);
        }
    }

}
