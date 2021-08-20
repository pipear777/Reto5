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
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;



@SuppressWarnings("serial")
public class ListaConsulta2 extends JFrame {

	private JPanel contentPane;
	private final JSeparator separator = new JSeparator();
	JScrollPane scrollPane;
	JTable tablaRequerimientos2;
	private JButton btnListar;

	/**
	 * Create the frame.
	 */
	public ListaConsulta2() {
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
		String titulos[]={ "ID MaterialConstruccion", "Nombre Material","Cantidad","Precio Unidad", "Precio Total"};
		String informacion[][]=obtenerMatriz();

		tablaRequerimientos2=new JTable(informacion,titulos);
		tablaRequerimientos2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(tablaRequerimientos2);

		TableColumnModel columnModel = tablaRequerimientos2.getColumnModel();

		columnModel.getColumn(0).setPreferredWidth(110);
		columnModel.getColumn(1).setPreferredWidth(200);
		columnModel.getColumn(2).setPreferredWidth(100);
		

	}

	private String[][] obtenerMatriz() throws SQLException {

		ControladorRequerimientos control = new ControladorRequerimientos();
		List<Requerimiento_2> requerimientos2 =control.consultarRequerimiento2();

		String matrizInfo[][]=new String[requerimientos2.size()][8];

		for (int i = 0; i < requerimientos2.size(); i++) {
			matrizInfo[i][0]=requerimientos2.get(i).getId_materialConstruccion()+"";
			matrizInfo[i][1]=requerimientos2.get(i).getNombre_material()+"";
			matrizInfo[i][2]=requerimientos2.get(i).getCantidad()+"";
			matrizInfo[i][3]=requerimientos2.get(i).getPrecio_unidad()+"";
			matrizInfo[i][4]=requerimientos2.get(i).getPrecio_total()+"";
		}

		return matrizInfo;
	}
}
