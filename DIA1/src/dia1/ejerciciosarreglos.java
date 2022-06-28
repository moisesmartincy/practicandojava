//BY: MOISES MARTIN CONDORI YUJRA 
package dia1;

import java.util.Scanner;

public class ejerciciosarreglos {

    public static void main(String[] args) {
        // arreglo
        Scanner entrada= new Scanner(System.in);
        int n,numero;
        System.out.print("digite la cantidad de elementos n: ");
        n=entrada.nextInt();
        int a[]= new int[n];
        boolean crec=true;
        //pedimos elementos del arreglo a
        do{
            for(int i=0;i<n;i++){
            System.out.print((i+1)+". digite los elemntos del vector: ");
            a[i]=entrada.nextInt();           
            }
            for(int i=0;i<n-1;i++){
                if(a[i]<a[i+1]){//creciente
                    crec=true;
                }
                if(a[i]>a[i+1]){
                    crec=false;
                    break;
                }
            }
            if(crec==false){
                System.out.println("\nElvector esta desordenado,digite nuevamente: \n");
            }
        }while(crec==false);
        
        //pedimos numero:
        System.out.print("\ndigite el numero a buscar: ");
        numero=entrada.nextInt();
        //buscamos el numero ene el vector
        int i=0;
        while(i<n && a[i]<numero){
            i++;
        }
        if(i==n){//hemos reccorido todo el arreglo
            System.out.println("\n Número no encontrado");
        }else{
            if(a[i]==numero){
                System.out.println("\nnumero encontrado en la posiciion: "+i);
            }else{
                System.out.println("\nNumero no encontrado: ");
            }
        }
    }
    
}
