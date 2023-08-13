package com.mycompany.bookcab;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kriz
 */
public class MyConnect {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "bookcab";
    private static Integer portnumber = 3306;
    private static String password = "";
    //public static Connection cnx = null;

    public static Connection getConnection(){
        
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + MyConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return cnx;
        
        
    }
    
    
}


    
    /*
    public ArrayList<String> connectionGetTable() {
        
        
        try {
            Class.forName("com.mysql.cj.dbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/booker", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from driver" );
            
            while(rs.next()) {
                name = rs.getString(2);
                address = rs.getString(5);
                phone = rs.getString(6);
                gender = rs.getString(7);
                plateNumber = rs.getString(8);
                brand = rs.getString(9);
                color = rs.getString(10);
                
                trans.add
                
            }
            rs.close();
            st.close();
        } catch(SQLException e) {
            
        }
        
    }
    
}*/
