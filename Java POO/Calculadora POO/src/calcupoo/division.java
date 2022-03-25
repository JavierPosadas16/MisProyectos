
package calcupoo;

import java.util.Scanner;

public class division {
    public void divisiones(){
        Scanner lector = new Scanner(System.in);
        int a,b,c;
        System.out.println("introduce el primer numero de la division");
        a = lector.nextInt();
        System.out.println("introduce el segundo numero");
        b = lector.nextInt();
        c = a/b;
        System.out.println(" la division es : "+c);}
}
