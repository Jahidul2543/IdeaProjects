package CodeLab;

import java.util.Scanner;

public class GasTank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lines");
        int count = 0;
        while (input.hasNext()) {
            input.nextLine();
            count++;
        }
    }
}
