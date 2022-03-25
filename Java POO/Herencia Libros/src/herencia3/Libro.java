
package herencia3;
public class Libro extends Publicacion {
    private boolean prestado;
    
    public Libro(String codigo, String titulo, int a) {
        super (codigo, titulo, a);
        prestado = false;
    }

    public void prestar() {
    prestado = true;
        
    }

    public void devolver() {
    prestado = false;
        
    }

    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString()+"prestado=" + prestado ;
    }
}
