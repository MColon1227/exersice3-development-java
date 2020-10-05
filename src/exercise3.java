import java.util.*;
import java.util.stream.Collectors;

public class exercise3 {

    // Create a method that orders by desc and asc order based on a parameter.
    public static List<String> sortList(List<String> valueList, boolean descending  ) {
       if(descending){
           return valueList.stream().sorted(Comparator.nullsLast(Comparator.reverseOrder())).collect(Collectors.toList());
       }
        else {
           return valueList.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).collect(Collectors.toList());
       }
    }

    // Create a method that removes null values
    public static List<String> removesNull(List<String> valueList){
        List<String> newList = new ArrayList<>();
        for(String s : valueList) {
            if(s != null && s.length() > 0) {
                newList.add(s);
            }
        }
        return newList;
    }

    // Method to Remove duplicates numbers--------->
    public static Set<Integer> removeDuplicates(List<Integer> numberList){
        Set<Integer> set = new HashSet<>(numberList);
        return set;
    }

    // Create a method that gives the missing number in 1 - 10
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
        System.out.println("Comparing " + l1 + " " + "and " + l2 + " " + "= " + "\n" + A.stringCompare(l1, l2));
        System.out.println();

        System.out.println("<---------//Checks if a string length is greater than 4 --------->");
        System.out.println(A.lengthGreaterThanFour());
        System.out.println();

        System.out.println("<---------//Use functionality from (A) in a new method from (B)--------->");
        String l3 = "'Exercise 3 of JAVA development'";
        System.out.println("Comparing " + l1 + " " + "and " + l3 + " " + "= " + "\n" + B.newStringCompare(l1, l3));
        System.out.println();

        System.out.println("<---------//Implement the interface in Class (B) Functionality: Print \"Hello Interface\"--------->");
        B hello = new B();
        hello.sayHello();
        System.out.println();

        System.out.println("<---------//Create a method that orders by desc and asc order based on a parameter.--------->");
        List<String> valueList = null;
        try {
            valueList = Arrays.asList("Text", "Baseball", "Automation", "Java", "Laptop",null);
            List<String> descendingList = sortList(valueList, false);
            descendingList.forEach(System.out::println);
            System.out.println("----------->");
            List<String> ascendingList = sortList(valueList, true);
            ascendingList.forEach(System.out::println);
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
