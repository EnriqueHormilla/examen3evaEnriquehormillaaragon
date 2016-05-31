/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.run;

import ejercicio4.controlador.Controlador;
import ejercicio4.modelo.Modelo;
import ejercicio4.vista.VistaSwing;

/**
 *
 * @author VESPERTINO
 */
public class run {
    public static void main(String[] args) {
        VistaSwing vista=new VistaSwing();
        Modelo modelo=new Modelo();
        Controlador control=new Controlador(modelo, vista);
    }
}
