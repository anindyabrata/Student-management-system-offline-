/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system.pkg1.pkg6;

/**
 *
 * @author anindya
 */

import java.sql.* ;
import javax.swing.* ;

public class ConnectionTest {
    Connection conn = null ;
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC") ;
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/anindya/NetBeansProjects/Student Management System 1.7/StudentInfo.sqlite") ;
            JOptionPane.showMessageDialog(null, "connection established");
            return conn ;
        }
        catch( Exception e ){
            JOptionPane.showMessageDialog(null, e);
            return null ;
        }
    }
    
    public static void main( String[] arg ) {
        ConnecrDb() ;
    }
}
