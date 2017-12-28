package reader;

public class TryCatch1 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 62;

        try{
            num1 =0;
            num2 = 65/num1;
            System.out.println(num2);
            System.out.println("Hey I am at the end fo the ");
        }
        catch (  ArithmeticException e ){

            System.out.println("You Should not divide by zero");

        }
        catch (Exception e ) {
            System.out.println("Exception Occured ");
            // this is generic exception handler which can handle all the exceptions.
            // By using this we can ensure next lines of code is going to run.
            //This will execute is the previous exception not handled properly.
        }
            System.out.println("I am out of Try Catch Block");
        }

    }

