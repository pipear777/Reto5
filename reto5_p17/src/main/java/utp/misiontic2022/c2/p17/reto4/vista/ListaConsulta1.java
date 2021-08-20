package utp.misiontic2022.c2.p17.reto4.vista;

import java.awt.Color;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumnModel;

import utp.misiontic2022.c2.p17.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;



@SuppressWarnings("serial")
public class ListaConsulta1 extends JFrame {

	private JPanel contentPane;
	private final JSeparator separator = new JSeparator();
	JScrollPane scrollPane;
	JTable tablaRequerimientos1;
	private JButton btnListar;

	/**
	 * Create the frame.
	 */
	public ListaConsulta1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(10, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		separator.setBounds(0, 76, 788, 36);
		contentPane.add(separator);
		
		scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(34, 110, 742, 346);
		contentPane.add(scrollPane);

		JPanel panel = new JPanel();
		scrollPane.setRowHeaderView(panel);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if (e.getSource()==btnListar) {
					try {
						construirTabla();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		btnListar.setBounds(288, 479, 72, 25);
		contentPane.add(btnListar);

		
	}
	
	private void construirTabla() throws SQLException {
		String titulos[]={ "Lider", "Cargo","# Proyectos"};
		String informacion[][]=obtenerMatriz();

		tablaRequerimientos1=new JTable(informacion,titulos);
		tablaRequerimientos1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(tablaRequerimientos1);

		TableColumnModel columnModel = tablaRequerimientos1.getColumnModel();

		columnModel.getColumn(0).setPreferredWidth(110);
		columnModel.getColumn(1).setPreferredWidth(200);
		columnModel.getColumn(2).setPreferredWidth(100);
		

	}

	private String[][] obtenerMatriz() throws SQLException {

		ControladorRequerimientos control = new ControladorRequerimientos();
		List<Requerimiento_1> requerimientos1 =control.consultarRequerimiento1();

		String matrizInfo[][]=new String[requerimientos1.size()][8];

		for (int i = 0; i < requerimientos1.size(); i++) {
			matrizInfo[i][0]=requerimientos1.get(i).getLider()+"";
			matrizInfo[i][1]=requerimientos1.get(i).getCargo()+"";
			matrizInfo[i][2]=requerimientos1.get(i).getProyectos()+"";
		}

		return matrizInfo;
	}
}
