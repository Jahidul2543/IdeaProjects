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

public class Jdbc {
    public static void main(String[] args) throws Exception {
         //  jdbc: database server mysql: working database
        String url = "jdbc:mysql://localhost:3306/userlogin"; // database url
        String uName ="root";
        String pass = "root"; // pass of userName
        String query = "select * from user_summery ;";

        //Class.forName("com.mysql.jdbc.Driver");
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // forName() will help u to load the Class Object(jdbc driver)
        // with JDBC 4.0API no need to call driver by Class.forName(), it is built in the java.sql package
         Connection con = DriverManager.getConnection(url, uName, pass);


        // Connection is an interfcae, to implement interface we need  method
        // get connection methods returns the instance of connection
        Statement st = con.createStatement();
        // createStaments() returns statement. Statement is an Interface
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
        String userData = rs. getInt(1)+ ":" + rs.getString("user_name");
        System.out.println(userData);}

        st.close();
        con.close();


    }
}
