
import java.sql.*;

public class InsertStatement {
    
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
        String q="insert into table1(tName,tCity) values(?,?)";

        PreparedStatement pstmt=con.prepareStatement(q);
        //set the values of query

        pstmt.setString(1,"mohit");
        pstmt.setString(2, "kolkata");
        pstmt.executeUpdate();
        System.out.println("Inserted");
        con.close();


    }catch(Exception e){
        e.printStackTrace();
    }}


}
