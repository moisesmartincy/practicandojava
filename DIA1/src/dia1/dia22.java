//BY: MOISES MARTIN CONDORI YUJRA
package dia1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class dia22 {

    public static void main(String[] args) {
        // entrada y salida de datos con Joptionpane
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena= JOptionPane.showInputDialog("Digite una cadena: ");
        entero= Integer.parseInt(JOptionPane.showInputDialog("Digite una entero: "));
        letra= JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal= Double.parseDouble(JOptionPane.showInputDialog("Digite una double: "));
        JOptionPane.showMessageDialog(null, "la dacena es: "+cadena);
        JOptionPane.showMessageDialog(null, "en numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "la letra es: "+letra);
        JOptionPane.showMessageDialog(null, "el numero double es: "+decimal);
    }    
}
