/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jvilchiso.a08;


public class SPPJVilchisOA08 {

 
    public static void main(String[] args) {
        // TODO code application logic here
         int prom,sumadePar=0,sumadeNon=0,contar=0;
        int[][] matrix = {{10,30,89,48,56},{32,23,84,20,10},{72,108,71,402,8}};
        for(int i=0;i<matrix.length;i=i+2){
            for(int j=0;j<matrix[i].length;j=j+2){
               sumadePar=sumadePar + matrix[i][j];
               contar++;
               prom=sumadePar/contar;
                System.out.println("El promedio es de " + prom);            
    }
             for (int[] matrix1 : matrix) {
                 for (int j = 1; j < matrix1.length; j=j+2) {
                     sumadeNon = sumadeNon + matrix1[j];
                     System.out.println("La suma de los numeros impares es de" + sumadeNon);
                 }
             }
        }
    }
}