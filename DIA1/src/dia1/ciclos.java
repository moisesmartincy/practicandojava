//BY: MOISES MARTIN CONDORI YUJRA
package dia1;

import java.util.Scanner;

public class ciclos {

    public static void main(String[] args) {
        // ciclos for
        int n;
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese hasta donde n: ");
        n=entrada.nextInt();
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }
        
    }
    
}
