/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultiplicationalgos;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mahmad.bscs13seecs
 */
public class MatrixMultiplyTest {
    
    public MatrixMultiplyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of multiplyIterative method, of class MatrixMultiply.
     */
    @Test
    public void testMultiplyIterative() {
        System.out.println("multiplyIterative");
        int dimensionArow = 2;
        int dimensionAcol = 2;
        int dimensionBrow = 2;
        int dimensionBcol = 2;
        int[][] expResult = {{2,2}, {2,2}};
        
        int [][] matA = {{1,1}, {1,1}};
        int [][] matB = {{1,1}, {1,1}};
        
        MatrixMultiply M = new MatrixMultiply(matA, matB);
        int [][] result = M.multiplyIterative(dimensionArow,dimensionAcol,dimensionBrow, dimensionBcol);
        
        //int[][] result = MatrixMultiply.multiplyIterative(dimensionArow, dimensionAcol, dimensionBrow, dimensionBcol);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
