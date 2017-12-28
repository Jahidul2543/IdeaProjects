
package CodeLab;

import java.lang.String;

public class Methods {

    String str = "jahidul2543";
    String str1 = "gmail.com";


    public static void main(String[] args) {

        System.out.println();
        int x = 2, y = 3, z = 4;
        int min;
        if (x < y && x < z) {
            min = x;
        } else if
                (y < x && y < z) {
            min = y;
        } else
            min = z;
        System.out.println(min);


    }

    public String min(String a, String b) {
        return a.concat("@" + a);
    }

    public String getFirstLine(String a) {
        return a.substring(0, a.indexOf('\n'));
    } //

    public boolean isEmailAddress(String a) {
        return a.matches("(./*)@(./*)");

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    /*
    * Write a class named Averager containing:

An instance variable named sum of type int, initialized to 0.
An instance variable named count of type int, initialized to 0.
A method named getSum that returns the value of sum.
A method named add that accepts an int parameter. The value of sum is increased by the value of the
parameter and the value of count is incremented by one.
A method named getCount that accepts no parameters. getCount returns the value of the count
instance variable, that is, the number of values added to sum.
A method named getAverage that accepts no parameters. getAverage returns the average of the
values added to sum. The value returned should be a value of type double (and therefore you must
cast the instance variables to double prior to performing the division).

    * */
    public class Averager {
        int sum = 0;
        int count = 0;

        public int getSum() {
            return sum;
        }

        public void add(int parameter) {
            sum += parameter;
            count++;
        }

        public int getCount() {
            return count;
        }

        public double getAverage() {
            return ((double) sum) / count;
        }

    }

    /*Write a class named GasTank containing:

An instance variable named amount of type double, initialized to 0.
A method named addGas that accepts a parameter of type double. The value of the
amount instance variable is increased by the value of the parameter.
A method named useGas that accepts a parameter of type double. The value of the
 amount instance variable is decreased by the value of the parameter.
A method named getGasLevel that accepts no parameters. getGasLevel returns the
value of the amount instance variable.
*/
    public class GasTan {
        double amount = 0;

        public void addGas(double parameter) {
            amount += parameter;
        }

        public void useGas(double parameter) {
            amount -= parameter;
        }

        public double getGasLevel() {
            return amount;
        }

    }

    /*Write a class named GasTank containing:

An instance variable named amount of type double, initialized to 0.
A method named addGas that accepts a parameter of type double. The value of the amount
 instance variable is increased by the value of the parameter.
A method named useGas that accepts a parameter of type double. The value of the amount instance
variable is decreased by the value of the parameter. However, if the value of amount
is decreased below 0, amount is set to 0.
A method named isEmpty that accepts no parameters. isEmpty returns a boolean value: true if the value of
 amount is less than 0.1, and false otherwise.
A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.
*/
    public class GasTank {
        private double amount = 0;

        public void addGas(double parameter) {
            amount += parameter;
        }

        public void useGas(double parameter) {
            amount -= parameter;
            if (amount < 0) {
                amount = 0;
            }
        }

        public boolean isEmpty() {
            if (amount < 0.1) {
                return true;
            } else {
                return false;
            }
        }

        public double getGasLevel() {
            return amount;
        }
    }

    public class ParkingMeter {
       private int timeLeft = 0;

        public boolean add(int parameter) {

            if (parameter == 25) {
                timeLeft += 30;
                return true;
            } else {
                return false;
            }

        }
        public void  tik(){
            if (timeLeft>0){
                timeLeft-- ;
            }
        }
        public boolean isExpired(){
            if (timeLeft==0){ return true;}
            else return false;
        }
    }
    public class Clockk{
        int hours;
        boolean isTicking;
        int diff;
        public Clockk(int hours, boolean isTicking, int diff){
            this.hours=hours;
            this.isTicking= isTicking;
            this.diff = diff;

        }
    }/*
    public class Clock{
        int hours;
        boolean isTickling;
        public Clock(){

        }
    }*/
    public class Clock{
        int hours;
        boolean isTicking;
        Integer diff;
        public Clock(int hours, boolean isTicking, Integer diff){
            this.hours = hours;
            this.isTicking = isTicking;
            this.diff= diff;


        }



    }/*
    public class Value {
        private boolean modified = false;
        private int val;

        public int getVal() {
            return val;
        }

        public Value(int x) {
            val = x;
        }

        public void setVal(int y) {
            val = y;
            boolean modified = true;
        }

        public boolean wasModified(boolean modified) {
            return true;
        }

    }*/
     /* public class Counter{
          private int counter;
          private int limit;
          static int nCounters = 0;
        *//*
      }*/
}
