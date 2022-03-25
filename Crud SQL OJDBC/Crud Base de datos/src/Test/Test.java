
package Test;

import Vendedores.Vendedores;
import Vendedores.bo.VendedorBO;
import Vendedores.dao.EmpleadoDAO;

public class Test {
    VendedorBO BO = new VendedorBO();
    Vendedores ven = new Vendedores();
   String mensaje = "";
    public void insertar() {

   mensaje = BO.eliminarVendedor(2);
    System.out.println(mensaje);
}
    
    public static void main (String[] args){
    Test test = new Test();
    test.insertar();
    
    }
}
