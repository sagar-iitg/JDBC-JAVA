import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class UserInput {
    

    
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
    

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            String name=br.readLine();

            System.out.println("Enter city");
            String city=br.readLine();


            pstmt.setString(1,name);
            pstmt.setString(2, city);
            pstmt.executeUpdate();
            System.out.println("Inserted");
            con.close();
    
    
        }catch(Exception e){
            e.printStackTrace();
        }}
}
