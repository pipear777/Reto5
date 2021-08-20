package utp.misiontic2022.c2.p17.reto4;

import java.awt.EventQueue;

import utp.misiontic2022.c2.p17.reto4.vista.VistaRequermientosSWING;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaRequermientosSWING frame = new VistaRequermientosSWING();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setSize(600, 650);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
