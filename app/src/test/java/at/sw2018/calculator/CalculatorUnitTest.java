package at.sw2018.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by alex on 21.03.18.
 */

public class CalculatorUnitTest {

    @Test
    public void testValueOf(){
        Integer i = 6;
        
    }

    @Test
    public void testDoAddition(){
        int result = Calculations.doAddition(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testDoSubtraction(){
        int result = Calculations.doSubtraction(7, 2);
        assertEquals(5, result);
    }
    @Test
    public void testDoMultiplication(){
        int result = Calculations.doMultiplication(2, 3);
        assertEquals(6, result);
    }
    @Test
    public void testDoDivision(){
        int result = Calculations.doDivision(8, 4);
        assertEquals(2, result);
    }
    @Test
    public void testDoDivision1(){
        int result = Calculations.doDivision(8, 0);
        assertEquals(0, result);
    }
    @Test
    public void testDoDivision2(){
        int result = Calculations.doDivision(11, 4);
        assertEquals(2, result);
    }
}

