package org.example.calculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

    public class CalculatorTest {

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(DivideByZeroException.class, () -> {
            calculator.divide(10, 0);
        });

        String expectedMessage = "Sıfıra bölme işlemi hatası";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        try {
            double result = calculator.divide(10, 2);
            assertEquals(5, result, 0.001);
        } catch (DivideByZeroException e) {
            fail("Exception should not be thrown for non-zero denominator");
        }
    }
}
