
package pooherencia;
public class Producto {
    String fechacad;
    int numlote;
  Producto (String fechacad,int numlote) {

        this.fechacad = fechacad;
        this.numlote = numlote; 
    }
        public String getfechacad () { 
            return fechacad;  }


        public int getnumlote () { 
            return numlote;   }
}
