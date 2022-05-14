
import java.sql.*;
import java.io.*;

public class ImageSave {

    public static void main(String[] args) {
        

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","1234");
            String q="insert into images(pic) values(?)";

            PreparedStatement pstmt=con.prepareStatement(q);
            FileInputStream fis=new FileInputStream("profile.png");

            pstmt.setBinaryStream(1, fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done....");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
