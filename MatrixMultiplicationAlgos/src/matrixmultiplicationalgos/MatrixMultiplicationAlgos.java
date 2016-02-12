/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplicationalgos;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mahmad.bscs13seecs
 */
public class MatrixMultiplicationAlgos {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here       
        
        int dimensionArow, dimensionAcol, dimensionBrow, dimensionBcol;
        
        
        
        Scanner user_input = new Scanner( System.in );
        
        System.out.println("Row dimension of Matrix A: ");      
        dimensionArow = user_input.nextInt();
        
        System.out.println("Col dimension of Matrix A: ");      
        dimensionAcol = user_input.nextInt();
        
        System.out.println("Row dimension of Matrix B: ");      
        dimensionBrow = user_input.nextInt();
        
        System.out.println("Col dimension of Matrix B: ");      
        dimensionBcol = user_input.nextInt();
        
        // Check dimensions
        while(dimensionAcol != dimensionBrow){
            
            System.out.println("Inconrrect dimensions");
            
            System.out.println("Row dimension of Matrix A: ");      
            dimensionArow = user_input.nextInt();
        
            System.out.println("Col dimension of Matrix A: ");      
            dimensionAcol = user_input.nextInt();
        
            System.out.println("Row dimension of Matrix B: ");      
            dimensionBrow = user_input.nextInt();
        
            System.out.println("Col dimension of Matrix B: ");      
            dimensionBcol = user_input.nextInt();           
            
        
        }
        
        int [][] matrixA = new int[dimensionArow][dimensionAcol];
        int [][] matrixB = new int[dimensionBrow][dimensionBcol];
        
        Random randomGenerator = new Random();
        // Random generator for matrices
        for (int i = 0; i < dimensionArow; i++){
        
            for (int j = 0; j < dimensionAcol; j++){
            
                int randomInt = randomGenerator.nextInt(11); // generating number from 0 to 10
                matrixA[i][j] = randomInt;
                
                randomInt = randomGenerator.nextInt(11); // generating number from 0 to 10
                matrixB[i][j] = randomInt;
                
            }
        }
        
        MatrixMultiply M = new MatrixMultiply(matrixA, matrixB);
        
        int [][] result = new int[dimensionArow][dimensionBcol];
        result = M.multiplyIterative(dimensionArow, dimensionAcol, dimensionBrow, dimensionBcol);
        
        
        // printing
        for (int i = 0; i < result.length; i++){
        
            for (int j = 0; j < result[0].length; j++){
            
                System.out.print(result[i][j]+"\t");
            }
            
            System.out.print("\n");
        }
        
    }
    
    
    
    
    
}
