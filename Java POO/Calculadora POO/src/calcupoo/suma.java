
package calcupoo;

import java.util.Scanner;

public class suma {
    public void sumas(){
        Scanner lector = new Scanner(System.in);
        int a,b,c;
        System.out.println("introduce el primer numero de la suma");
        a = lector.nextInt();
        System.out.println("introduce el segundo numero");
        b = lector.nextInt();
        c = a+b;
        System.out.println(" la suma es : "+c);
    }
}
