//BY: MOISES MARTIN CONDORI UIJRA
package dia1;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        // clase math
        double raiz,raiz1,base,expo,resulta,numero,numero1;
        long redondear;
        raiz=Math.sqrt(36.67);
        raiz1=(int)Math.sqrt(25);
        base=5;
        expo=2;
        numero=5.6;
        resulta=Math.pow(base,expo);
        redondear=Math.round(numero);
        numero1=Math.random();
        System.out.println("la raiz del numero es: "+raiz);
        System.out.println("la raiz del numero es: "+raiz1);
        System.out.println("la potencia es: "+resulta);
        System.out.println("el redondeo es: "+redondear);
        System.out.println("el random es: "+numero1);
    }
    
}
