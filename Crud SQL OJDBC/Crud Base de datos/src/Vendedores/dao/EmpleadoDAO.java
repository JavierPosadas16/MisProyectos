/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedores.dao;

import Vendedores.Vendedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JTable;

/**
 *
 * @author racco
 */
public class EmpleadoDAO {
    
    private String mensaje = "";
    
    public String agregarVendedor(Connection connection, Vendedores ven){
        PreparedStatement pst = null;
        String sql = "INSERT INTO PROYECTO_BD.vendedor (id_vendedor, nombre, apellido, comision) "
                + "values (vendedor_SEQ.NEXTVAL , ?, ?, ?)";
        try {
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, ven.getNombre());
            pst.setString(2, ven.getApellido());
            pst.setInt(3, ven.getComision());
            mensaje = "Registro correcto";
            pst.execute();
            pst.close();

        } catch (Exception e) {
                        mensaje = "error \n"+ e.getMessage();

        }
        
    return mensaje;
    }
     public String modificarVendedor(Connection connection, Vendedores ven){
       PreparedStatement pst = null;
        String sql = "UPDATE PROYECTO_BD.vendedor SET nombre = ? , apellido = ?, comision = ?"
                + " where id_vendedor = ?";
        try {
           pst.setInt(1, ven.getId_vendedores());
            pst = connection.prepareStatement(sql);
            pst.setString(2, ven.getNombre());
            pst.setString(3, ven.getApellido());
            pst.setInt(4, ven.getComision());
            
            mensaje = "modificado correcto";
            pst.execute();
            pst.close();

        } catch (Exception e) {
                        mensaje = "error \n"+ e.getMessage();

        }
    return mensaje;
    }
      public String eliminarVendedor(Connection connection, int id){
       PreparedStatement pst = null;
        String sql = "DELETE FROM PROYECTO_BD.vendedor  where id_empleado = ? ";
        
        try {
            pst = connection.prepareStatement(sql);
            pst.setInt(1, id);

        } catch (Exception e) {
                        mensaje = "error \n"+ e.getMessage();

        }
    return mensaje;
    }
      public void listarVendedores(Connection connection, JTable tabla){}
    
}
