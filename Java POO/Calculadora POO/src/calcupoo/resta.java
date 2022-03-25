
package calcupoo;

import java.util.Scanner;

public class resta {
    public void restas(){
        Scanner lector = new Scanner(System.in);
        int a,b,c;
        System.out.println("introduce el primer numero de la resta");
        a = lector.nextInt();
        System.out.println("introduce el segundo numero");
        b = lector.nextInt();
        c = a-b;
        System.out.println(" la resta es : "+c);}
}
