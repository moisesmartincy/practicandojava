//BY: MOISES MATIN CONDORI YUJRA
package dia1;

import java.util.Scanner;

public class ejercicios1 {

    public static void main(String[] args) {
        //ejercicio la calificacion de un estdiante
        double pp,pex,sex,exf,calfin;
        Scanner entrada= new Scanner(System.in);
        System.out.print("la participacion es: ");
        pp=entrada.nextDouble();
        System.out.print("la nota primer p es: ");
        pex=entrada.nextDouble();
        System.out.print("la nota seg par es: ");
        sex=entrada.nextDouble();
        System.out.print("la nota ex final es: ");
        exf=entrada.nextDouble();
        calfin=pp*0.1+pex*0.25+sex*0.25+exf*0.4;
        System.out.println("la nota final es: "+calfin);
    }   
}
