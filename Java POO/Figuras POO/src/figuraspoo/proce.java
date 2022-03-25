
package figuraspoo;

import java.util.Scanner;

public class proce {
    private Scanner lector;
    private int a,b,c,e,f;
    private Double d;
    
public void inicializar(){
    lector=new Scanner(System.in);
    System.out.println("dame el primer digito");
    a=lector.nextInt();
    System.out.println("dame el segundo digito");
    b=lector.nextInt();
}
public void imprimir(){
    System.out.println("al area del circulo es "+d);
    System.out.println("el area del cuadrado es "+c);
    System.out.println("el area del rectangulo es "+e);
    System.out.println("el area del triangulo es "+f);
}
public void circulo(){
    d=3.1416*(a*a);
    
}
public void cuadrado(){
    c=a*a;
    
}
public void rectangulo(){
    e=a*b;
    
}
public void triangulo(){
    f=(a*b)/2;
}
}
