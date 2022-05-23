package co.edu.unbosque.controller;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import co.edu.unbosque.model.Futbol;
import co.edu.unbosque.view.VentanaBienvenido;
import co.edu.unbosque.view.VentanaInicio;


public class Controller implements ActionListener{

	private Futbol futbol;
	private VentanaBienvenido ventana_bienvenido;
	private VentanaInicio ventana_inicio;
	
	public Controller() {
		ventana_bienvenido = new VentanaBienvenido();
		ventana_inicio = new VentanaInicio();
		futbol = new Futbol();
		asignarOyentes();
		
       
	}
	
	
	public void asignarOyentes() {
		ventana_bienvenido.getBt_iniciar().addActionListener(this);
		ventana_bienvenido.getBt_salir().addActionListener(this);
		ventana_inicio.getPseleccion().getMenu().addActionListener(this);
		ventana_inicio.getBt_Regresar().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if((e.getActionCommand().equals("INICIAR"))) {

			ventana_bienvenido.setVisible(false);
			ventana_inicio.setVisible(true);
			ventana_inicio.getPfutbol().setVisible(false);
		
			
		}
		
		if ((e.getActionCommand().equals("OPCIONES"))){
			String opcion = ventana_inicio.getPseleccion().getMenu().getSelectedItem().toString();
			
			if(opcion.equals("FUTBOL")) {
				ventana_inicio.getPfutbol().setVisible(true);

				ventana_inicio.add(ventana_inicio.getPfutbol());	
				
			}	
			ventana_inicio.repaint();
		}
		
		if((e.getActionCommand().equals("SALIR"))){
			
			System.exit(1);
		}
		
		if((e.getActionCommand().equals("REGRESAR"))){

			ventana_bienvenido.setVisible(true);
			ventana_inicio.setVisible(false);
		}
		
		
		}
	
	
	
	}
