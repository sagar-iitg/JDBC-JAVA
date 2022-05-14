/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;

import java.sql.*;


/**
 *
 * @author Sagar Kumar
 */

//singleton class

public class ConnectionProvider {
    
    private static Connection con;
    
    public static Connection getConnection(){
        
        
        try{
            
   
        if(con==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","1234");
            
            
            
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
