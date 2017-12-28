package Practice;

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

        System.out.println("Method 15: " + bb.contains("aut"));
        System.out.println("Method 15.1" + bb.contains("mobile"));











    }

}
