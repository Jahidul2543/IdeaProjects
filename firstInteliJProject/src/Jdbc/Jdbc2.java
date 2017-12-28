package Jdbc;


import java.sql.*;

        /*
         * 1.  import java.sql.*
         * 2. load and register the diver--->com.mysql.jdbc.Driver
         * 3. Create connection ---> Connection
         * 4. Create Statement ---> Statement
         * 5. Execute the query --->
         * 6. Process the results --->
         * 7. Close
         * */

public class Jdbc2 {
    public static void main(String[] args) throws Exception {
        //  jdbc: database server mysql: working database
        String url = "jdbc:mysql://localhost:3306/userlogin"; // database url
        String uName ="root";
        String pass = "Khukumoni1529"; // pass of userName
        String query = "insert into user_summery values (14,'Nack');"; // inserting data

        //Class.forName("com.mysql.jdbc.Driver");
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // forName() will help u to load the Class Object(jdbc driver)
        // with JDBC 4.0API no need to call driver by Class.forName(), it is built in the java.sql package
        Connection con = DriverManager.getConnection(url, uName, pass);
        // Connection is an interfcae, to implement interface we need  method
        // get connection methods returns the instance of connection
        Statement st = con.createStatement();
        // createStaments() returns statement.
        int count = st.executeUpdate(query);
        System.out.println(count + "Row/s effected");

        st.close();
        con.close();


    }
}
