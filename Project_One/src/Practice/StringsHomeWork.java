package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StringsHomeWork {

    public static void main(String[] args) {

        String x = "Book";
        System.out.println("Method 1: " + x.concat(" Author"));
        // concatenate strings

        String a = "Hello, how are you today?";
        System.out.println("Method 2: " + a.length());
        // counts the number of character

        System.out.println("Method 3: " + a.equalsIgnoreCase("Hello how is your baby?"));
        // compares to string

        String b = "abc";
        System.out.println("Method 4: "+ a.equals("abc"));

        System.out.println("Method 5: " + b.compareToIgnoreCase("cba"));
        //a negative integer, zero, or a positive integer as the specified String is greater than,
        // equal to, or less than this String, ignoring case considerations.

         String ends = "One day we all has to leave, no matter who we are";
        System.out.println("Method 6: " + ends.endsWith("With"));

        System.out.println("Method 7: " + ends.hashCode());
        // Hashcode of a String

        System.out.println("Method 8: " + ends.lastIndexOf('s'));

        System.out.println("Method 9: "+ ends.intern());// ??????

        System.out.println("Method 10: " +ends.indexOf('E'));
        // here is no upper case 'E' thus it shows -1

        System.out.println("Method 11: " + ends.replace(',', '.'));

        System.out.println("Method 12: " + "UnHappy".substring(2));//with beginning index
        System.out.println("Method 13: " +"UnHappyMan".substring(3,6));// with beginIndex and endIndex

        String bb = "He has automobile and mobile company";
        System.out.println("Method 14: " + bb.matches("(.*)auto(.*)"));// true
        System.out.println("Method 14.1:" + bb.matches("He(.*)")); // true
        System.out.println("Method 14.2:" + bb.matches("(.*)has(.*)")); //true
        System.out.println("Method 14.3:" + bb.matches("(.*)company")); // true
        System.out.println("Method 14.4:" + bb.matches("(.*)Auto(.*)"));  // false

        System.out.println("Method 15: " + bb.contains("aut")); // true
        System.out.println("Method 15.1: " + bb.contains("mobile"));// true
        System.out.println("Method 16: " + bb.replaceAll("He(./*)", "She "));
        System.out.println("Method 17: " + bb.replaceAll("company($)", "factory"));
        //using regular expression $ to mention as last string of the index.
        String dog = "The dog plays in the yard.";
        System.out.println("Method 18: " + dog.subSequence(3,8));

        String place = "Pacific is beautiful";
        String [] aSplit = place.split("is");
        System.out.println("Method 19: ");
        System.out.println("The first part of the array is : " + aSplit[0]);
        System.out.println("The last part of the array is : " + aSplit[1]);

        /*System.out.println("Method 20: ");
        String[] aSplit2 = place.split("is",15);//place.length()-4 );
        System.out.println("The first part of the array is : " + aSplit2[0]);
        System.out.println("The first part of the array is : "  + aSplit2[1]);*/
        System.out.println("Method 20: " + String.join(" ", "Java", "is", "cool"));
         //a new String that is composed of the elements separated by the delimiter
        System.out.println("Method 21: " + place.toLowerCase());
        System.out.println("Method 22: " + place.toUpperCase());

        System.out.println("Method 23: ");
        String trimM = "Good Morning     ";
        System.out.println("Length before trim:" + trimM.length());
        String afterTrim = trimM.trim();
        System.out.println("Length after trim: "+ afterTrim.length());
        System.out.println("Method 24: "+ place.toString());
        Integer i = 5;
        System.out.println("Method 24: "+ i.toString() );
        String s = "Hello world";
        System.out.println("Method 25: " + String.valueOf('c'));
        System.out.println("Method 25.1 " + String.valueOf(20));
        System.out.println("Method 25.2 " + String.valueOf("true"));
        System.out.println("Method 26: "+ s.codePointAt(4));
        //Returns the character (Unicode code point) at the specified index.
        System.out.println("Method 27: " + s.codePointBefore((s.length()-1)));
        System.out.println("Method 28: " + s.codePointCount(4, 8));
        System.out.println("Method 29: " + s.isEmpty() );

        String str1 = "First String";
        String str2 = "Second String";

        StringBuffer strB = new StringBuffer("First String");

        System.out.println("Method 30.1: " + str1.contentEquals(strB));
        System.out.println("Method 30.2: " + str2.contentEquals(strB));
        System.out.println("Method 31: " + str1.startsWith("First"));

    }

}
