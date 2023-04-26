package main;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Consultas {
    
    Conexion conn = new Conexion();
    
    //metodos
    public boolean register(String nombre, String evaluacion1, String evaluacion2,
            String evaluacion3, String estatus){
        
     PreparedStatement ps = null;
     Connection c = conn.getConnection();
     String setence = "INSERT INTO alumnos (nombre, evaluacion1, evaluacion2, evaluacion3, estatus)"
             + "VALUES(?,?,?,?,?)";
     
     try{
         
         ps = c.prepareStatement(setence);
         ps.setString(1, nombre);
         ps.setString(2, evaluacion1);
         ps.setString(3, evaluacion2);
         ps.setString(4, evaluacion3);
         ps.setString(5, estatus);
         
         ps.executeUpdate();
         conn.disconnect();
         return true;
         
     }catch(SQLException e){
         JOptionPane.showMessageDialog(null, e.toString());
         conn.disconnect();
         return false;
     }
        
    }
    
    public void modify(String nombre, String evaluacion1, String evaluacion2, 
            String evaluacion3, String estatus, String id){
        
        PreparedStatement mod =null;
        String sentence = "UPDATE alumnos set nombre = ?, evaluacion1= ?,evaluacion2= ?, evaluacion3= ?,"
                + "estatus = ? WHERE id_alumno = "+id;
        Connection c = conn.getConnection();
        
        try{
            
        mod = c.prepareStatement(sentence);
        
        mod.setString(1, nombre);
        mod.setString(2, evaluacion1);
        mod.setString(3, evaluacion2);
        mod.setString(4, evaluacion3);
        mod.setString(5, estatus);
        
        mod.executeUpdate();
        conn.disconnect();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            conn.disconnect();
            
        }
        
        
    }
    
    public void delete(String id){
        
        PreparedStatement dll = null;
        String sentence = "delete from alumnos where id_alumno = "+id;
        Connection c = conn.getConnection();
        
        try{
            dll = c.prepareStatement(sentence);
            dll.executeUpdate();
            conn.disconnect();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            conn.disconnect();
        }
        
    }
    
        public int isRegistre(String name){
        

         PreparedStatement ps = null;
         ResultSet rs = null;
         
        try{
           Connection c = conn.getConnection();
           String sql = "select count(nombre) from alumnos where nombre = ?";
           ps = c.prepareStatement(sql);
           ps.setString(1, name);
           rs = ps.executeQuery();
           
           if(rs.next()){
               System.out.println(rs.getInt(1));
               
               return rs.getInt(1);//retorna la cantidad 0,1
           }
           else{
               return -2;//si no puede iterar regresa otro numero
           }
   
           
           
           
        }
        catch(SQLException e){

            JOptionPane.showMessageDialog(null, e.toString());
            return -2;
        }
        
    }
    
    
    
    
}
