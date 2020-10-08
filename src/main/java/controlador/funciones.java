
package controlador;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alex_
 */
public class funciones extends JPanel {
    
    public funciones(){

        
    }
       public void rectangulo(Graphics g, int ancho, int altura){
          
    g.drawRect( 0,  0, ancho, altura);
    }
    
       public void calcularSuperficie(JLabel r, float base, float altura){
       float area = 0;
       
       area = base * altura;
       
       r.setText("La superficie es de: " + area);
       }
       
           public boolean validarNumero(String cantidad){
    
        try {
		Integer.parseInt(cantidad);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
        }
}
