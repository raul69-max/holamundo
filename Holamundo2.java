/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo2;
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.SwingConstants;
public class Holamundo2 {

    public static void main(String[] args) {
  JFrame ventana = new JFrame("Hola Mundo"); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setSize(400, 400); 
        ventana.setLocationRelativeTo(null); 
JLabel etiqueta = new JLabel("¡Hola, Mundo!", SwingConstants.CENTER); 
ventana.add(etiqueta);  
ventana.setVisible(true);  
    }  
}  
   
 