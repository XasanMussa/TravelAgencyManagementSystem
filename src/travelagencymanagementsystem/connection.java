/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelagencymanagementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
public class connection {
    public static Connection getConnect(){
        String address="jdbc:mysql://localhost:3306/travelagencydb?serverTimezone=UTC";
        String userName="root";
        String password="";
        try{
        Connection con =DriverManager.getConnection(address, userName, password);
        if(con!=null)return con;
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        }  
        return null; 
    } 

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
