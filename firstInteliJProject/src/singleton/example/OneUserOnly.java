package singleton.example;

public class OneUserOnly {
    private static OneUserOnly user1 = new OneUserOnly();

    private OneUserOnly(){

    }
    public static OneUserOnly getUser1(){

        return user1;
    }
    public void user1(){
        System.out.println("On user only");
    }

}
