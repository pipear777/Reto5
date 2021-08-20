package utp.misiontic2022.c2.p17.reto4.vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class VistaRequermientosSWING extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public VistaRequermientosSWING() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 564, 576);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 5, 2, 2);
		panel.add(scrollPane);
		
		JLabel lblRequerimiento1 = new JLabel("Requerimiento 1:  ");
		lblRequerimiento1.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblRequerimiento1.setBounds(74, 28, 193, 32);
		panel.add(lblRequerimiento1);
		
		JTextArea txtrEstaConsulta = new JTextArea();
		txtrEstaConsulta.setLineWrap(true);
		txtrEstaConsulta.setEditable(false);
		txtrEstaConsulta.setText("Esta consulta, Lista cada uno de los líderes que trabajan con la constructora Pegaso, por el nombre completo, cargo y cantidad de proyectos que lideran, ordenados por el cargo y el nombre completo.");
		txtrEstaConsulta.setBounds(220, 20, 297, 132);
		panel.add(txtrEstaConsulta);
		
		JButton btnConsultar1 = new JButton("Consultar RQ1");
		btnConsultar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnConsultar1)
				{			
					ListaConsulta1 lista = new ListaConsulta1();
					lista.setVisible(true);
				}
			}
		});
		btnConsultar1.setBounds(53, 92, 136, 23);
		panel.add(btnConsultar1);
		
		JTextArea txtrListaLosProyectos = new JTextArea();
		txtrListaLosProyectos.setLineWrap(true);
		txtrListaLosProyectos.setText("Lista los proyectos, por el id del material de construcción, el nombre del material, cantidad, precio por unidad y precio total, de los proyectos con id 14, 20, 18, 36, 45, 48, y 56. Se ordenan de forma ascendente por ID y descendente por el precio unitario.");
		txtrListaLosProyectos.setWrapStyleWord(true);
		txtrListaLosProyectos.setEditable(false);
		txtrListaLosProyectos.setBounds(220, 198, 297, 145);
		panel.add(txtrListaLosProyectos);
		
		JTextArea txtrListaLosProyectos_1 = new JTextArea();
		txtrListaLosProyectos_1.setWrapStyleWord(true);
		txtrListaLosProyectos_1.setText("Lista los proyectos, por el id del material de construcción, el nombre del material, cantidad, precio por unidad y precio total, de los proyectos con id 14, 20, 18, 36, 45, 48, y 56. Se ordenan de forma ascendente por ID y descendente por el precio unitario.");
		txtrListaLosProyectos_1.setLineWrap(true);
		txtrListaLosProyectos_1.setEditable(false);
		txtrListaLosProyectos_1.setBounds(220, 382, 297, 145);
		panel.add(txtrListaLosProyectos_1);
		
		JLabel lblRequerimiento_1 = new JLabel("Requerimiento 2:  ");
		lblRequerimiento_1.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblRequerimiento_1.setBounds(74, 198, 193, 32);
		panel.add(lblRequerimiento_1);
		
		JButton btnConsultar2 = new JButton("Consultar RQ2");
		btnConsultar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnConsultar2)
				{			
					ListaConsulta2 lista2 = new ListaConsulta2();
					lista2.setVisible(true);
				}
			}
		});
		btnConsultar2.setBounds(53, 262, 136, 23);
		panel.add(btnConsultar2);
		
		JLabel lblRequerimiento_1_1 = new JLabel("Requerimiento 3:  ");
		lblRequerimiento_1_1.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblRequerimiento_1_1.setBounds(74, 382, 193, 32);
		panel.add(lblRequerimiento_1_1);
		
		JButton btnConsultar3 = new JButton("Consultar RQ3");
		btnConsultar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnConsultar3)
				{			
					ListaConsulta3 lista3 = new ListaConsulta3();
					lista3.setVisible(true);
				}
			}
		});
		btnConsultar3.setBounds(53, 446, 136, 23);
		panel.add(btnConsultar3);
	}
}
