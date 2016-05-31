/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author VESPERTINO
 */
public class Matriz {
    private int[][] matriz;
    private int tam;
    

    public Matriz(int[][] matriz, int tam) {
        this.matriz = matriz;
        this.tam = tam;
    }
    public boolean dimeSiEsIdentidad(){
        boolean de=true;
        for (int i = 0; i < tam; i++) {
           if(matriz[i][i]!=1) {
               de=false; 
               break;
           }
        }
        return de;
    }
    
}
