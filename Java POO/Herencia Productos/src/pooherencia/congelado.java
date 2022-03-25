
package pooherencia;
public class congelado extends Producto {
    int temp;

     public congelado(String fechacad, int numlote) {
        super(fechacad, numlote);
        
        temp=0;
        
               
                
    }
    public int gettemp () { 
            return temp;  }
    public void settemp(int temp){
    this.temp=temp;}
    public void mostrarc() {


        System.out.println (" numero de lote: " + getnumlote() + " fecha de caducidad: " +  getfechacad() +

         " temperatura : " + gettemp()); }
}
