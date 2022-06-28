//BY: MOISES MARTIN CONDORI YUJRA
package dia1;

import java.util.Scanner;

public class condicionales {

    public static void main(String[] args) {
        //condicionales switch
        int dato;
        Scanner entrada= new Scanner(System.in);
        System.out.print("ingrese dato: ");
        dato= entrada.nextInt();
        switch(dato){
            case 1: System.out.println("el numero es 1");
            break;
            case 2: System.out.println("el numero es 2");
            break;
            case 3: System.out.println("el numero es 3");
            break;
            case 4: System.out.println("el numero es 4");
            break;
            case 5: System.out.println("el numero es 5");
            break;
            default: System.out.println("el numero no esta en el rango del 1 al 5");
            break;
        }
    }
    
}
