/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;

import java.sql.*;

public class SelectJDBC {
    
    
    public static void main(String[] args) {
        
        try{
            
            Connection con=ConnectionProvider.getConnection();
            
            
            String query="select * from table1";
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(query);
            
            
            while(set.next()){
                int id=set.getInt(1);
                String name=set.getString(2);
                String city=set.getString(3);
                
                System.out.println(id+" "+name+" "+city+" ");
                
            }
            
            con.close();
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
