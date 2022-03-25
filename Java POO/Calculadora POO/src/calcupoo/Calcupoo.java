
package calcupoo;

import java.util.Scanner;

public class Calcupoo {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        int opcion;
    suma s=new suma();
    resta r=new resta();
    multiplicacion m=new multiplicacion();
    division d=new division();
    do{   
    System.out.println("presione 1 para suma");
        System.out.println("presione 2 para resta");
        System.out.println("presione 3 para multiplicacion");
        System.out.println("presione 4 para division");
        System.out.println("presione 5 para salir");
       opcion = lector.nextInt();
       
       switch (opcion){
                case 1:
                  s.sumas();
                  break;
                case 2:
                 r.restas();
                case 3:
                 m.mutiplicaciones(); 
                break;
                case 4:
                 d.divisiones();
                break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("elije una opcion valida");
                    
     }
       } while (opcion!=5);
            
            
        
        
   
    }
    
}
