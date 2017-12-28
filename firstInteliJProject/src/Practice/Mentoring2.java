package Practice;

import java.util.Scanner;

public class Mentoring2 {


    public Mentoring2(){

    }
    public Mentoring2(int x, int y){

    }

    /* class name
    variables > Instance variable 2.
    constructors
    main method
    methods
    object

     */
    int x = 3; // instance variable
    static int  y = 4; // class level variable

    public void workHard(){

        int z = 5; // local variable
    }


    public static void main(String[] args) {

        Mentoring2 obj1 = new Mentoring2();

        Mentoring2 obj2 = new Mentoring2(2,4); // reference variable/ object variable
        obj2.workHard();
        //System.out.println(obj2.workHard());

        int e = 3;

        System.out.println(e);

        Scanner input  = new Scanner(System.in);
        System.out.printf("Enter data: ");
        int datum = input.nextInt();
        System.out.println("Show Datum: "+ datum);

    }
}

// what is enum type?