
package ende3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ende3Test {
    
    public Ende3Test() {
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
        
        Ende3 instance = new Ende3 ();
        
        System.out.println(" dos parámetros enteros");
        int a = 5;
        int b = 9;
   
     
        
      return 1;  
     
        
    }
    public int testSumRango(){
        Ende3 instance = new Ende3 ();
        
        return 1;
    }
     public boolean testIsPar(){
         Ende3 instance = new Ende3 ();
         int a = 2; 
         boolean result = instance.equals(0);
         if (a%2==0) {
             return true; 
             
         }
         int expResult = 0;
         assertEquals(expResult, result);
         return true;
    }
     public boolean testExtraerPositivos(){
         Ende3 instance = new Ende3 ();
         return true;
    }
}
