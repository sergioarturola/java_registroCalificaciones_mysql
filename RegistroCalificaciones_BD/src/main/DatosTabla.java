/*
   Clase encargada de traer los datos de la BD al jtable
 */
package main;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DatosTabla{

    Conexion connect = new Conexion();//objeto que ya tiene la conexion
    PreparedStatement sentence = null;
    ResultSet result = null;
    //metodo para llenar con tados la tabla
    public void fillTable(JTable table) {

        //creando el modelo de la tabla y añadiendolo al componente
        DefaultTableModel model = new DefaultTableModel();
        table.setModel(model);

        //llenando las filas
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Evaluacion 1");
        model.addColumn("Evaluacion 2");
        model.addColumn("Evaluacion 3");
        model.addColumn("Estatus");

        //estableciendo la conexion y llenando la tabla
        try {
              Connection con = connect.getConnection();
              String sql = "SELECT * FROM alumnos";
              sentence = con.prepareStatement(sql);
              result = sentence.executeQuery();
              //objeto para poder sacar numero de columnas de la tabla
              ResultSetMetaData countCol = result.getMetaData();
              int col = countCol.getColumnCount();
              
              //iterando en los datos
              while(result.next()){
                  //la jtable admite un array de objetos en su constructor
                  Object [] data = new Object[col];
                  //con un ciclo for se llena la fila
                  for(int i = 0; i<col; i++){
                      data[i] = result.getObject(i+1);//+1 porque no hay columnas 0 en sql
                  }
                  //sale del ciclo for y agrega el array de objeto al modelo
                  model.addRow(data);
              }
              
        } catch(SQLException e)  {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {//al final nos desconectamos
            
            connect.disconnect();
        }

    }
}
