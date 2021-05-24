
package ende3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public int testRango() {
        
        Operaciones instance = new Operaciones ();
        
        System.out.println(" dos parámetros enteros");
        int a = 5;
        int b = 9;
        rango [] = a-b;
        double result = instance.equals(rango.getLength());
        
        double expResult = [5,6,7,8,9];
        assertEquals(expResult,result);
   
     
        
      return 1;  
     
        
    }
    public int testSumRango(){
        Operaciones instance = new Operaciones ();
        
        return 1;
    }
    @Test
     public void testIsPar(){
         Operaciones instance = new Operaciones ();
         
         int a = 2;
         
         instance.isPar(a);
          
         boolean result = instance.isPar(a);
         boolean expResult = true;
         assertEquals(expResult, result);
         return true;
    }
     public boolean testExtraerPositivos(){
         Operaciones instance = new Operaciones ();
         return true;
    }
}
