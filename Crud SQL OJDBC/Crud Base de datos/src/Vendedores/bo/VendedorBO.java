package Vendedores.bo;

import Vendedores.Vendedores;
import Vendedores.dao.EmpleadoDAO;
import java.sql.Connection;

public class VendedorBO {
     private String mensaje= "";
     private EmpleadoDAO venDAO = new EmpleadoDAO();

    
    public String agregarVendedor(Vendedores ven){
      Connection connection = Conexion.conexion.getConexion();
        try {
            mensaje = venDAO.agregarVendedor(connection, ven);
            connection.rollback();
        } catch (Exception e) {
        mensaje = mensaje + e.getMessage();
        }finally{
            try {
                if (connection!=null) {
                    connection.close();
                } 
            } catch (Exception e) {
                        mensaje = mensaje + e.getMessage();

            }
        
        }
        
    return mensaje;
    }
     public String modificarVendedor(Vendedores ven){
      Connection connection = Conexion.conexion.getConexion();
        try {
            mensaje = venDAO.modificarVendedor(connection, ven);
            connection.rollback();
        } catch (Exception e) {
        mensaje = mensaje + e.getMessage();
        }finally{
            try {
                if (connection!=null) {
                    connection.close();
                } 
            } catch (Exception e) {
                        mensaje = mensaje + e.getMessage();

            }
        
        }
        
    return mensaje;
    }
      public String eliminarVendedor(int id){
      Connection connection = Conexion.conexion.getConexion();
        try {
            mensaje = venDAO.eliminarVendedor(connection, id);
            connection.rollback();
        } catch (Exception e) {
        mensaje = mensaje + e.getMessage();
        }finally{
            try {
                if (connection!=null) {
                    connection.close();
                } 
            } catch (Exception e) {
                        mensaje = mensaje + e.getMessage();

            }
        
        }
        
    return mensaje;
    }
      public void listarVendedores(){
      
      }
}
