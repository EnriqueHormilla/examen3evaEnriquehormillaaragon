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
public class Run {
    public static void main(String[] args) {
        int tamanio=5;
        //Creacion de una matriz de tam 5
        int[][] matriz=new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(i==j){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        matriz[4][4]=0;

        //Para ver visualmente la matriz
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(   matriz[i][j]);
            }
            System.out.println("");
        }
        Matriz m=new Matriz(matriz, tamanio);
        System.out.println(m.dimeSiEsIdentidad());
        
         //Creacion de una matriz de tam 5
        int tamanio1=3;
        int[][] matriz1=new int[tamanio1][tamanio1];
        for (int i = 0; i < tamanio1; i++) {
            for (int j = 0; j < tamanio1; j++) {
                if(i==j){
                    matriz1[i][j]=1;
                }else{
                    matriz1[i][j]=0;
                }
            }
        }
        
        
        for (int i = 0; i < tamanio1; i++) {
            for (int j = 0; j < tamanio1; j++) {
                System.out.print(   matriz1[i][j]);
            }
            System.out.println("");
        }
        
        Matriz m1=new Matriz(matriz1, tamanio1);
        System.out.println(m1.dimeSiEsIdentidad());
    }
    
}
