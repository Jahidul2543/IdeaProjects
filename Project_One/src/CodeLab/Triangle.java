package CodeLab;


/*
* 1            *
* 2          * * *
* 3        * * * * *
* 4      * * * * * * *
*        1 2 3 4 5 6 7 column i
*
*
*/



public class Triangle {
    public static void main(String[] args) {
        int i=0, j =0;
        int n=0;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
