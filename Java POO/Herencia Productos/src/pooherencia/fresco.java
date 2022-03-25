/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooherencia;

public class fresco extends Producto {
    String fechaenv;
    String pais;
    public fresco(String fechacad, int numlote) {
        super(fechacad, numlote);
        
        fechaenv="Desconocido";
        pais="Desconocido";
               
                
    }
    
    public String getfechaenv () { 
            return fechaenv;  }
    public String getpais () { 
            return pais;  }
    public void setfechaenv(String fechaenv){
    this.fechaenv=fechaenv;}
    public void setpais(String pais){
    this.pais=pais;}
    
    public void mostrarf() {


        System.out.println (" numero de lote: " + getnumlote() + " fecha de caducidad: " +  getfechacad() +

         " fecha envasado: " + getfechaenv()+" pais: "+getpais() ); }

} 

