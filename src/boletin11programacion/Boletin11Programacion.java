package boletin11programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin11Programacion {

    
    public static void main(String[] args) {
        long timestat, timeend;
        JOptionPane.showMessageDialog(null, "ESCRIBE A SEGUINTE FRASE :");
        
        timestat = System.currentTimeMillis();
        JOptionPane.showInputDialog("\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática ");
        
        timeend = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "PREME ENTER PARA REMATAR");
        JOptionPane.showMessageDialog(null, " TARDACHES " + (timeend - timestat) / 1000 + " SEGUNDOS EN ESCRIBIR A FRASE");
    }
    
}
