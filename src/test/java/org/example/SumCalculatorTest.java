package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void createSumCalculator(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumCalculatorExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }

    @Test
    void sumCalculatorOneTest(){
        int expectedResult = 1;
        int actualResult = sumCalculator.sum(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sumCalculatorThreeTest(){
        int expectedResult = 6;
        int actualResult = sumCalculator.sum(3);
        assertEquals(expectedResult, actualResult);
    }
}