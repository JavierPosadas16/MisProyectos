/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

/**
 *
 * @author HP Workstation
 */
public class Revista extends Publicacion{
    private int numero;
    
    
public Revista(String codigo, String titulo, int a,int numero) {
super(codigo, titulo, a);
this.numero = numero;
}



@Override
public String toString() {
return super.toString() + "Numero: " + numero;
}

}


