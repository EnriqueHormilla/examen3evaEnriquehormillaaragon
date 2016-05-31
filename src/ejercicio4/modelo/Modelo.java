/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VESPERTINO
 */
public class Modelo {
    private FileReader fileLeer;
    private FileWriter fileWriter;
    private BufferedWriter escribir;
    private BufferedReader leer;
    private TreeSet collection;
    private String rutaNomFile1,nomFile2,rutaFile2;

    public Modelo() {
        
    }
    public void inicializarArchivos(String rutaNomFile1, String nomFile2){
        this.nomFile2 = nomFile2;
        this.rutaFile2=rutaNomFile1+nomFile2;
        try {
            fileLeer=new FileReader(rutaNomFile1);
            fileWriter=new FileWriter(rutaFile2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    public boolean filtradoNumeros(){
        try {
            fileLeer=new FileReader(rutaNomFile1);
            leer=new BufferedReader(fileLeer);
            String aux=leer.readLine();
            int a,b;
            while (aux!=null) {  
                a=aux.charAt(0);
                b=aux.charAt(aux.length());
                if(a==b){
                   collection.add(aux); 
                }                
                aux=leer.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return true;
    }
    public boolean filtraColecion(){
        for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            if((next.length()==1)&&(next.length()>6)){
              if(collection.contains(next)){
                  collection.remove(next);
              }
            }                            
        }
          return true;
    }
    public boolean rellenaDestino(){
        try {
            fileWriter=new FileWriter(rutaFile2);
            escribir=new BufferedWriter(fileWriter);
         
            int dato;
            for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
                String next = (String) iterator.next();
                //dato=Integer.valueOf(next);
                int suma=0,numeroBucle;                
                char caracter;
                for (int i = 0; i < next.length(); i++) {
                    caracter=next.charAt(i);
                    numeroBucle=caracter;
                    suma=suma+numeroBucle;
                    escribir.write(next.charAt(i));
                    escribir.write('+');
                }
                escribir.write('=');
                escribir.write(suma);
                escribir.newLine();                
            }
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
          return true;
    }
    
    
    
    

    public FileReader getFileLeer() {
        return fileLeer;
    }

    public void setFileLeer(FileReader fileLeer) {
        this.fileLeer = fileLeer;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public BufferedWriter getEscribir() {
        return escribir;
    }

    public void setEscribir(BufferedWriter escribir) {
        this.escribir = escribir;
    }

    public BufferedReader getLeer() {
        return leer;
    }

    public void setLeer(BufferedReader leer) {
        this.leer = leer;
    }

    public TreeSet getCollection() {
        return collection;
    }

    public void setCollection(TreeSet collection) {
        this.collection = collection;
    }

    public String getRutaNomFile1() {
        return rutaNomFile1;
    }

    public void setRutaNomFile1(String rutaNomFile1) {
        this.rutaNomFile1 = rutaNomFile1;
    }

    public String getNomFile2() {
        return nomFile2;
    }

    public void setNomFile2(String nomFile2) {
        this.nomFile2 = nomFile2;
    }

    public String getRutaFile2() {
        return rutaFile2;
    }

    public void setRutaFile2(String rutaFile2) {
        this.rutaFile2 = rutaFile2;
    }


    
    
    
    
}
