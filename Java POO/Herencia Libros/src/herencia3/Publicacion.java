
package herencia3;
public class Publicacion {
    private String codigo;
private String titulo;
private int a;

public Publicacion(String codigo, String titulo, int a) {

this.codigo = codigo;
this.titulo = titulo;
this.a = a;
}

public String getCodigo() {
return codigo;
}

public void setCodigo(String codigo) {
this.codigo = codigo;
}

public String getTitulo() {
return titulo;
}

public void setTitulo(String titulo) {
this.titulo = titulo;
}

public int getA() {
return a;
}

public void setA(int a) {
this.a = a;
}

@Override
public String toString() {
return "codigo=" + codigo + ", titulo=" + titulo + ", año =" + a ;
}

}







