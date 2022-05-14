
import java.sql.*;

class FirstJDBC{
public static void main(String[] args) {
    
    try{

        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");//for mysql
        //create a connection

        String url="jdbc:mysql://localhost:3306/youtube";
        String username="root";
        String password="1234";

        Connection con=DriverManager.getConnection(url,username,password);


        if(con.isClosed()){
            System.out.println("connection is closed");

        }
        else{
            System.out.println("Connection Created...");
        }
    }catch(Exception e){
        e.printStackTrace();
    }
}

}