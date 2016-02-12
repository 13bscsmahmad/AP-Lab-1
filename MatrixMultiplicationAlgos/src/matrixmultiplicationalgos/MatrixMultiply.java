/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplicationalgos;

/**
 *
 * @author mahmad.bscs13seecs
 */
public class MatrixMultiply {
    
    public static int[][] matrixA;
    public static int[][] matrixB;
    
    public MatrixMultiply(int[][] a, int[][] b){
    
        matrixA = a;
        matrixB = b;
    }
    
    public static int[][] multiplyIterative(int dimensionArow, int dimensionAcol, int dimensionBrow, int dimensionBcol){
    
        int[][] result = new int[dimensionArow][dimensionBcol];
        int sum = 0;
        
        // multiply matrix using traditional iteration method
        
        for (int i = 0; i < dimensionArow; i++){
        
            for (int j = 0; j < dimensionBcol; j++){
            
                for (int k = 0; k < dimensionBrow; k++){
                
                    result[i][j] += matrixA[i][k] * matrixB[k][j];                
                    
                }
            }
        }
        
        return result;
        
                
    }
    
    
}
