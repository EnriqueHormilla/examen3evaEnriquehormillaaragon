/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.vista;

import ejercicio4.controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author VESPERTINO
 */
public class VistaSwing extends JFrame implements ActionListener,Vista{

    private JPanel pContenedorArriba,pContenedorAbajo,pContenedorBox;
    
    
//    private BorderLayout contenedorPrincipalLayout;
//    private GridLayout tablaFicherosLayout;
//    private FlowLayout contenedorDeAbajoLayout;

    
   
    private JFileChooser jfChooser;
    private JLabel jlFichero1, jlFichero2;
    private JTextArea jtFichero1,jtFichero2;
    private JButton jbGo, jbSeleccionar;
    private JCheckBox jcFiltrandoNumeros, jcFiltraColeccion, jcRellenoDestino;

    public VistaSwing() {
        pContenedorArriba=new JPanel();
        jlFichero1=new JLabel("Fichero 1:");
        jlFichero2=new JLabel("Fichero 2:");
        
        jtFichero1=new JTextArea("");
        jtFichero2=new JTextArea("");
        
        jbGo=new JButton("GO|");
        
        
        jbSeleccionar=new JButton("Seleccionar");
      
        
        jcFiltrandoNumeros=new JCheckBox("Realizando método FiltrandoNumeros");        
        jcFiltraColeccion=new JCheckBox("Realizando método FiltraColeccion");        
        jcRellenoDestino=new JCheckBox("Realizando método RellenaDestino");
        
        //Parte de arriba
        pContenedorArriba=new JPanel(new GridLayout(2, 3));
        pContenedorArriba.add(jlFichero1);
        pContenedorArriba.add(jtFichero1);
        pContenedorArriba.add(jbSeleccionar);
        pContenedorArriba.add(jlFichero2);
        pContenedorArriba.add(jtFichero2);
        //tablaFicheros.add(jlFichero1);
        
        
        //pANEL DE ABAJO DERECHA
         pContenedorBox=new JPanel(new FlowLayout());
         pContenedorBox.setLayout(new BoxLayout(pContenedorBox, WIDTH));
         pContenedorBox.add(jcFiltrandoNumeros);
         pContenedorBox.add(jcFiltraColeccion);
         pContenedorBox.add(jcRellenoDestino);
        //Parte de abajo
        pContenedorAbajo=new JPanel(new FlowLayout());
        pContenedorAbajo.add(jbGo);
        pContenedorAbajo.add(pContenedorBox);
        //Flow de Abajo
        
//        JPanel a=new JPanel(new BorderLayout());
//        a.
//        
        

        //this.getContentPane().setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(pContenedorArriba,BorderLayout.NORTH);
        this.getContentPane().add(pContenedorAbajo,BorderLayout.SOUTH);
//        this.getContentPane().add(tablaFicheros);
//        this.getContentPane().add(contenedorDeAbajo);
        this.setVisible(true);
        this.setTitle("Ejercicio 4 MVC");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }
//    public static void main(String[] args) {
//        Vista v=new Vista();
//    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    public void cargarFile(){
        jfChooser=new JFileChooser();
          if(jfChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
              //La ruta esta bien
              jtFichero1.setText(jfChooser.getSelectedFile().getPath());
          }
    }

    @Override
    public String obtenerJtFichero1() {
        return jtFichero1.getSelectedText();
    }

    @Override
    public String obtenerJlFichero2() {
        return jtFichero1.getSelectedText();
    }

    @Override
    public void checkJcFiltrandoNumeros() {
      jcFiltrandoNumeros.setSelected(true);
    }

    @Override
    public void checkJcFiltraColeccion() {
    
      jcFiltraColeccion.setSelected(true);
    }

    @Override
    public void checkJcRellenoDestino() {
   
       jcRellenoDestino.setSelected(true);
    }

    @Override
    public void setControlador(Controlador con) {
        jbSeleccionar.addActionListener(con);
        jbSeleccionar.setActionCommand("selecionar");
        
        jbGo.addActionListener(con);
        jbGo.setActionCommand("go");
    }

    public JPanel getpContenedorArriba() {
        return pContenedorArriba;
    }

    public void setpContenedorArriba(JPanel pContenedorArriba) {
        this.pContenedorArriba = pContenedorArriba;
    }

    public JPanel getpContenedorAbajo() {
        return pContenedorAbajo;
    }

    public void setpContenedorAbajo(JPanel pContenedorAbajo) {
        this.pContenedorAbajo = pContenedorAbajo;
    }

    public JPanel getpContenedorBox() {
        return pContenedorBox;
    }

    public void setpContenedorBox(JPanel pContenedorBox) {
        this.pContenedorBox = pContenedorBox;
    }

    public JFileChooser getJfChooser() {
        return jfChooser;
    }

    public void setJfChooser(JFileChooser jfChooser) {
        this.jfChooser = jfChooser;
    }

    public JLabel getJlFichero1() {
        return jlFichero1;
    }

    public void setJlFichero1(JLabel jlFichero1) {
        this.jlFichero1 = jlFichero1;
    }

    public JLabel getJlFichero2() {
        return jlFichero2;
    }

    public void setJlFichero2(JLabel jlFichero2) {
        this.jlFichero2 = jlFichero2;
    }

    public JTextArea getJtFichero1() {
        return jtFichero1;
    }

    public void setJtFichero1(JTextArea jtFichero1) {
        this.jtFichero1 = jtFichero1;
    }

    public JTextArea getJtFichero2() {
        return jtFichero2;
    }

    public void setJtFichero2(JTextArea jtFichero2) {
        this.jtFichero2 = jtFichero2;
    }

    public JButton getJbGo() {
        return jbGo;
    }

    public void setJbGo(JButton jbGo) {
        this.jbGo = jbGo;
    }

    public JButton getJbSeleccionar() {
        return jbSeleccionar;
    }

    public void setJbSeleccionar(JButton jbSeleccionar) {
        this.jbSeleccionar = jbSeleccionar;
    }

    public JCheckBox getJcFiltrandoNumeros() {
        return jcFiltrandoNumeros;
    }

    public void setJcFiltrandoNumeros(JCheckBox jcFiltrandoNumeros) {
        this.jcFiltrandoNumeros = jcFiltrandoNumeros;
    }

    public JCheckBox getJcFiltraColeccion() {
        return jcFiltraColeccion;
    }

    public void setJcFiltraColeccion(JCheckBox jcFiltraColeccion) {
        this.jcFiltraColeccion = jcFiltraColeccion;
    }

    public JCheckBox getJcRellenoDestino() {
        return jcRellenoDestino;
    }

    public void setJcRellenoDestino(JCheckBox jcRellenoDestino) {
        this.jcRellenoDestino = jcRellenoDestino;
    }




}
