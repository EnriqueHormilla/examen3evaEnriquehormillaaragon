/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio2 {
    private int n,longitud,prima,hueco,huecosLado,lleno;
    private char c;
    private boolean bajar=false;

    public Ejercicio2(int n, char c) {
        this.n = n;
        this.c = c;       
        longitud=n;
        prima=n;
        hueco=0;
        huecosLado=0;
        lleno=0;
    }
     
    public void calcularHexagono(){        
        for (int i = 0; i < n-1; i++) {
            longitud=longitud+2;
        }
        System.out.println(longitud);
       
            //todo el cuadro lleno           
            for (int j = 0; j < longitud; j++) {
               
                hueco=longitud-prima;
                huecosLado=(longitud-prima)/2;                
                lleno=longitud-hueco;
                for (int k = 0; k < huecosLado; k++) {
                    System.out.print(" ");                    
                } 
                for (int k = 0; k < lleno; k++) {
                    System.out.print(c);  
                }
                for (int k = 0; k < huecosLado; k++) {
                    System.out.print(" ");                    
                }
              
                if(bajar){
                  prima=prima-2;   
                }else{
                   if(prima>=6){
                        bajar=true;
                    }
                    prima=prima+2;
                }
              System.out.println("");                        
            }

        
    }
    
    
}
