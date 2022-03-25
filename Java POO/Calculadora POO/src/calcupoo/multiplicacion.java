/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcupoo;

import java.util.Scanner;

/**
 *
 * @author HP Workstation
 */
public class multiplicacion {
    public void mutiplicaciones(){
        Scanner lector = new Scanner(System.in);
        int a,b,c;
        System.out.println("introduce el primer numero de la multiplicacion");
        a = lector.nextInt();
        System.out.println("introduce el segundo numero");
        b = lector.nextInt();
        c = a*b;
        System.out.println(" la multiplicacion es : "+c);
    }
}
