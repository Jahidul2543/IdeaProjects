package Array;

public class ArrayDemo {
    public static void main(String[] args) {
        // declare an array of integers
        //int[] anArray;
        // allocate memory for 10 integers
        //anArray = new int[10];
        /*anArray [0]=100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5]= 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9]=1000;*/
        int[] anArray = {1, 2, 3 ,4 ,6 ,8, 9 ,22, 23, 24};

        /*System.out.println("Element at index 0:" + anArray[0]);
        System.out.println("Element at index 1:" + anArray[1]);
        System.out.println("Element at index 2:" + anArray[2]);
        System.out.println("Element at index 3:" + anArray[3]);
        System.out.println("Element at index 4:" + anArray[4]);
        System.out.println("Element at index 5:" + anArray[5]);
        System.out.println("Element at index 6:" + anArray[6]);
        System.out.println("Element at index 7:" + anArray[7]);
        System.out.println("Element at index 8:" + anArray[8]);
        System.out.println("Element at index 9:" + anArray[9]);
        */
       int x = anArray[10];
        System.out.println(x);
        System.out.println(anArray.length);
        int lengthOfArray = anArray.length;

        for (int i=0; i<lengthOfArray; i++ )
            System.out.println(anArray[i]+ " ");


       int searchKey=2;
        for (int i=0; i<lengthOfArray; i++);
        int i=0;
    if (anArray[i]==searchKey)
        {
        System.out.println("Found "+ searchKey);

    }


    }
}
