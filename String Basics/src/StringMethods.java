import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "ABHRA";
        System.out.println("Your name is :->" + name);
        /*
         * Here various String methods are described
         */

        // ! The length of a string
        int len = name.length();  
        System.out.println("The length of the string is: " + len);
        // ! To check if the string is empty or not
        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);
        // ! To check two strings are same or not
        String surname = "MONDAL";
        boolean isEqual = name.equals(surname);
        System.out.println(isEqual);
        // !To check two strings are same or not irrespective of cases
        boolean isSame = name.equalsIgnoreCase(surname);
        System.out.println(isSame);
        // ! Indexing methods
        int index = name.indexOf("A"); //! Gives the first index
        int lastIndex = name.lastIndexOf("A");
        System.out.println("The first index is :->" + index + "The last index is:->" + lastIndex);
        // ! Extracting Methods
        char c = name.charAt(0); // ! Extracting a particular character
        System.out.println(c);
        String str = name.substring(0, 3); //! To extract a substring
        System.out.println(str);
        // ! Modifying methods **Please note strings are immutable(not changable) in java so if we want to change a string we need no to strore the chaged copy of the string into a new string
         String n = name.toLowerCase();
         String newname = n.toUpperCase();
         System.out.println(n);
         System.out.println(newname);
        // ! To convert a string into character array
        char[] strArray = name.toCharArray();
        System.out.println(Arrays.toString(strArray)); 
        // ! To remove whits spaces from a string
        String spacedString = "         VENOM           ";
        String modifed = spacedString.trim();
        System.out.println("Previous string is :-> " + spacedString);
        System.out.println("New string is :-> "+ modifed);
    }
    
}
