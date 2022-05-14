
import java.sql.*;

public class InsertJDBC {
    
    public static void main(String[] args) {
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");//for mysql
            //create a connection

            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="1234";

            Connection con=DriverManager.getConnection(url,username,password);

            //create a query

            String q="CREATE TABLE table1 ( tId int(20) primary key AUTO_INCREMENT, tName varchar(200) not null, tCity varchar(400))";


            //craete staement

            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created in database");
            con.close();


        }catch(Exception e){
            e.printStackTrace();


        }


    }
}
