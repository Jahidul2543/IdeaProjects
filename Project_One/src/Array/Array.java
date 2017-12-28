package Array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int numberOfStudent = 10;
        int [] stID = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<stID.length; i++){
            System.out.println("Plz enter value");
            int value = sc.nextInt() ;
         stID[i] = value;


        }

        System.out.println("Lets read the array");
        for (int i=0; i<stID.length; i++){
            System.out.println(stID[i]);}


    }
}
