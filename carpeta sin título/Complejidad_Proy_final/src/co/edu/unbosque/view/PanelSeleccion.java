package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelSeleccion extends JPanel{
	
	private JLabel opciones;
	private JComboBox<String> menu;
	
	
	public PanelSeleccion() {
		setLayout(new FlowLayout());
		funcionar();
		setBackground(new Color(200,1,45));
	}

	public void funcionar() {
		opciones = new JLabel("Escoja el algoritmo:");
		add(opciones);
		
		menu =  new JComboBox<String>();
		menu.addItem("--Seleccione--");
		menu.addItem("FUTBOL");
		menu.setActionCommand("OPCIONES");
		add(menu);
		
	}

	public JLabel getOpciones() {
		return opciones;
	}

	public void setOpciones(JLabel opciones) {
		this.opciones = opciones;
	}

	public JComboBox<String> getMenu() {
		return menu;
	}

	public void setMenu(JComboBox<String> menu) {
		this.menu = menu;
	}
	
	
}
