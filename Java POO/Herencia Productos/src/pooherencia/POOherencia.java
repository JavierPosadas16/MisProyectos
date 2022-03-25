
package pooherencia;
public class POOherencia {
    public static void main(String[] args) {
    fresco a = new fresco ("12/10/2020",33);
        refrigerado b = new refrigerado ("14/10/2020",88);
    congelado c =new congelado ("20/5/2021",32);
    
    a.setfechaenv("12/30/25");
    a.setpais("australia");
    
    b.setcodigo(1230);
    
    c.settemp(25);
        
    
    a.mostrarf();
    
    b.mostrarr();
    
    c.mostrarc();
    }
    }
    

