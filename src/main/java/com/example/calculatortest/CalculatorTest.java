package com.example.calculatortest;

import org.junit.Before;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest  {
    private CalculatorService calcTestService;
    private int num1;
    private int num2;
    private int num3;
    private int num4;


    @Before
    public void setUp() {
        calcTestService = new CalculatorService();
        num1 = 8;
        num2 = 6;
        num3 = 4;
        num4 = 2;

    }


    @Test
    public void plus() {
        int actual1 = calcTestService.plus(num1, num2);
        int expected1 = num1 + num2;

        int actual2 = calcTestService.plus(num3, num4);
        int expected2 = num3 + num4;


        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void minus() {
        int actual1 = calcTestService.minus(num1, num2);
        int expected1 = num1 - num2;

        int actual2 = calcTestService.minus(num3, num4);
        int expected2 = num3 - num4;


        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void muityply() {
        int actual1 = calcTestService.multiply(num1, num2);
        int expected1 = num1 * num2;

        int actual2 = calcTestService.multiply(num3, num4);
        int expected2 = num3 * num4;


        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void divide() {
        double actual1 = calcTestService.divide(num1, num2);
        double expected1 = (double) num1 / num2;

        double actual2 = calcTestService.divide(num3, num4);
        double expected2 = (double) num3 / num4;


        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void showExeption() {
        try {
            calcTestService.divide(num1, num4);
        } catch (IllegalArgumentException e) {
        }
    }
}
