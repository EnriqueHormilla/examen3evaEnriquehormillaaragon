/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.vista;

import ejercicio4.controlador.Controlador;

/**
 *
 * @author VESPERTINO
 */
public interface Vista {
    public abstract String obtenerJtFichero1();
    public abstract String obtenerJlFichero2();
    
    //metodos que ponen a realizada la tarea
    public abstract void  checkJcFiltrandoNumeros();
    public abstract void  checkJcFiltraColeccion();
    public abstract void  checkJcRellenoDestino();
    
    public abstract void cargarFile();
    public abstract void setControlador(Controlador c);    
    
}
