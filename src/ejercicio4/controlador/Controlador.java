/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.controlador;

import ejercicio4.modelo.Modelo;
import ejercicio4.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;

/**
 *
 * @author VESPERTINO
 */
public class Controlador implements ActionListener{
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setControlador(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("selecionar")){
           vista.cargarFile();
       }else{
          String s1=vista.obtenerJtFichero1();
          String s2=vista.obtenerJlFichero2();
          modelo.inicializarArchivos(s1, s2);
         if( modelo.filtradoNumeros());
          vista.checkJcFiltrandoNumeros();
          if(modelo.filtraColecion());
          vista.checkJcFiltraColeccion();
         if( modelo.rellenaDestino())
          vista.checkJcRellenoDestino();
       }
        
    }
    
}
