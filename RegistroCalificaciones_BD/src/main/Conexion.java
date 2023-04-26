/*
   Clase encargada de establecer la conexion a la base de datos
 */

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private final String url = "jdbc:mysql://localhost:3306/registro_calificaciones";
    private final String user = "root";
    private final String pass = "1234";
    Connection conexion = null;
    
    public Connection getConnection(){
        try{
            conexion = (Connection) DriverManager.getConnection(url, user, pass);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return conexion;
    } 
    
    
    public void disconnect(){
        conexion = null;
    }
}
