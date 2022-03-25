package pooherencia;

public class refrigerado extends Producto {

    int codigo;

    public refrigerado(String fechacad, int numlote) {
        super(fechacad, numlote);

        codigo = 0;

    }

    public int getcodigo() {

        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    public void mostrarr() {

        System.out.println(" numero de lote: " + getnumlote() + " fecha de caducidad: " + getfechacad()
                + " codigo : " + getcodigo());
    }
}
