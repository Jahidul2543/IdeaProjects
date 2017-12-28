package Practice;

public class Practice {
    int a = 3;

    public Practice(){} // no argument /default constructor

    public Practice(int a){} // prameterized constructor


    // access modifier / return type/ method name(){}
   //Return Type :

    public int practiceJava(int a, int c){

        int total = a + c ;
        //System.out.println("total :" + total);
        return total;

        /*int x = 2;
        System.out.println(x);
        System.out.println(a);*/
    }

    public static void main(String[] args) {

        Practice obj = new Practice();
        obj.practiceJava(2, 2);

        Practice obj2 = new Practice(2);
        obj2.practiceJava(3, 4);

        System.out.println("Learn Java");
    }

    //  2+2 = 4; 4*1=4; 5-1=4;
    // .java compiler >(.class)byte codes // run time environment JVM > OS/MPhone



}
