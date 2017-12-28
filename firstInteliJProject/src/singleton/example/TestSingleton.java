package singleton.example;

public class TestSingleton {
    public static void main(String[] args) {
        /*DatabaseLicense objDataBase = new DatabaseLicense();
        objDataBase.databaseConnection();*/
        // int          x               =    new ClassName();
        DatabaseLicense databaseLicense = DatabaseLicense.getInstance();
   // this is how we called  object reference 'instance' in this main method even this is
    //    private, by using getter method and as because
        DatabaseLicense databaseLicense1 = DatabaseLicense.getInstance2();

        databaseLicense.databaseConnection();
        databaseLicense1.databaseConnection2();
    }
}
