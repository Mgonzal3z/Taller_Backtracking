package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Clase VentanaInicio que contiene los tres paneles adicionales
* @author Andres Carbonell y Luis Esteban Castro
 *
 */
public class VentanaInicio extends JFrame{
	
	private PanelSeleccion pseleccion; //atributo que llama al panel de seleccion
	private PanelFutbol pfutbol;
	private JButton bt_Regresar;// Boton para regresar a la ventana de bienvenida
	
	/**
	 * Constructor de la clase VentanaInicio que inicializa los atributos y metodos de la ventana
	 */
	public VentanaInicio() {
		
		setTitle("Algoritmos");
		setSize(900, 700);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		elementos();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}
	
	/**
	 * Metodo que inicializa los atributos, les da sus especificaciones y los agrega a la ventana.
	 */
	public void elementos() {
		
		pseleccion = new PanelSeleccion();
		pseleccion.setBounds(0, 0, 900, 40);
		getContentPane().add(pseleccion);
		
		pfutbol = new PanelFutbol();
		pfutbol.setBounds(0, 40, 900, 560);
		getContentPane().add(pfutbol);
		
		bt_Regresar = new JButton("Regresar");
		bt_Regresar.setActionCommand("REGRESAR");
		bt_Regresar.setBounds(700, 620, 100, 30);
		bt_Regresar.setVisible(true);
		add(bt_Regresar);
		
	}

	public PanelSeleccion getPseleccion() {
		return pseleccion;
	}

	public void setPseleccion(PanelSeleccion pseleccion) {
		this.pseleccion = pseleccion;
	}


	public PanelFutbol getPfutbol() {
		return pfutbol;
	}

	public void setPfutbol(PanelFutbol pfutbol) {
		this.pfutbol = pfutbol;
	}

	public JButton getBt_Regresar() {
		return bt_Regresar;
	}

	public void setBt_Regresar(JButton bt_Regresar) {
		this.bt_Regresar = bt_Regresar;
	}
	
	
}
