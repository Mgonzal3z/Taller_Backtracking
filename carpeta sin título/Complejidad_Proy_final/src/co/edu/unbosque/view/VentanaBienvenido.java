package co.edu.unbosque.view;

import java.awt.Color;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class VentanaBienvenido  extends JFrame{
	
	private ImageIcon ImagenBienvenida;// imagen de fondo de la ventana Bienvenido
	private JButton bt_iniciar;// Boton para entrar a la ventana de inicio
	private JButton bt_salir;// Boton para salir del programa
	private JLabel bienvenida;  // Atributo Jlabel que contiene la imagen de fondo
	private int ancho;//Atributo que contiene el ancho de la pantalla
	private int alto;// Atributo que contiene el alto de la pantalla
	
	/**
	 * Constructor de la clase VentanaBienvenido que inicializa los atributos y metodos de la ventana
	 */
	public VentanaBienvenido() {
		
		setTitle("Bienvenido");
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLayout(null);
		setSize(533, 460);
		setLocation((int) (ancho / 3.2), (int) (alto / 4.5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setBackground(Color.blue);
		
		Botones();
		
		Dimension tam = getSize();
		ImagenBienvenida = new ImageIcon(getClass().getResource("/Imagen/IMAGEN.png"));
		bienvenida = new JLabel(ImagenBienvenida);
		bienvenida.setBounds(0, 0, tam.width, tam.height);

		add(bienvenida);
		
		setResizable(false);
		setVisible(true);
	}
	
	/**
	 * Metodo Botones que contiene los botones principales de la ventana
	 */
	public void Botones() {
		
		bt_iniciar = new JButton("Iniciar");
		bt_iniciar.setActionCommand("INICIAR");
		bt_iniciar.setBounds(70, 350, 180, 30);
		bt_iniciar.setVisible(true);
		add(bt_iniciar);
		
		bt_salir = new JButton("Salir");
		bt_salir.setActionCommand("SALIR");
		bt_salir.setBounds(290, 350, 180, 30);
		bt_salir.setVisible(true);
		add(bt_salir);
	}

	public ImageIcon getImagenBienvenida() {
		return ImagenBienvenida;
	}

	public void setImagenBienvenida(ImageIcon imagenBienvenida) {
		ImagenBienvenida = imagenBienvenida;
	}

	public JButton getBt_iniciar() {
		return bt_iniciar;
	}

	public void setBt_iniciar(JButton bt_iniciar) {
		this.bt_iniciar = bt_iniciar;
	}

	public JButton getBt_salir() {
		return bt_salir;
	}

	public void setBt_salir(JButton bt_salir) {
		this.bt_salir = bt_salir;
	}

	public JLabel getBienvenida() {
		return bienvenida;
	}

	public void setBienvenida(JLabel bienvenida) {
		this.bienvenida = bienvenida;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	

}
