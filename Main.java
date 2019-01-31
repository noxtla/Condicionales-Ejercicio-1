/*Determinar si un numero es multiplo de 10*/

package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		/*Pedir datos al usuario*/
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		/*Fin de pedir los datos al usuario*/
		/*-----------------------------------------------------------------------------*/
		/*Inicio de la logica del programa*/
		
		if (numero%10 == 0 ) {
			JOptionPane.showMessageDialog(null, "El numero " +numero + " es multlipo de 10");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "El numero " +numero+ " no es multiplo de 10");
		}
		
		/*Fin de la logica del programa */

	}

}
