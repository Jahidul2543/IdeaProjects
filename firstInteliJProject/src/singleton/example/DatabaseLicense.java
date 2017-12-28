package singleton.example;

public class DatabaseLicense {

    private static DatabaseLicense instance = new DatabaseLicense(); // 1st reference var
    // reference variable/object variable named instance
    private static DatabaseLicense instance2 = new DatabaseLicense();  // 2nd reference var
    private DatabaseLicense() {
    }
             public static DatabaseLicense getInstance(){
                    return instance;  // shall return object reference
    }
            public static DatabaseLicense getInstance2(){
           return  instance2;

            }
    public void databaseConnection(){

        System.out.println("You are authorised for one connection ");
    }
    public void databaseConnection2(){
        System.out.println("You are authorised for 2nd connection");
    }

}
