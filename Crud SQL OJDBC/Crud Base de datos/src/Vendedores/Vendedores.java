/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedores;

/**
 *
 * @author racco
 */
public class Vendedores {
    private int id_vendedores;
    private String nombre;
    private String Apellido;
    private int comision;

    public Vendedores() {
    }

    public Vendedores(int id_vendedores, String nombre, String Apellido, int comision) {
        this.id_vendedores = id_vendedores;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.comision = comision;
    }

    public int getId_vendedores() {
        return id_vendedores;
    }

    public void setId_vendedores(int id_vendedores) {
        this.id_vendedores = id_vendedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Vendedores{" + "id_vendedores=" + id_vendedores + ", nombre=" + nombre + ", Apellido=" + Apellido + ", comision=" + comision + '}';
    }
    
       
}
