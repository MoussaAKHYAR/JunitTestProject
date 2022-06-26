package com.amranetech.testing;

import com.amranetech.entities.Calculator;
import org.junit.jupiter.api.Test;

import static com.sun.javafx.fxml.expression.Expression.multiply;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddTwoNumbers(){
        //Arrange
        int a = 2, b = 3;
        Calculator calculator = new Calculator();

        //Act
        int somme = calculator.add(a,b);

        // Assert
        assertEquals(5, somme);

    }

    @Test
    void testMultiplyTwoNumbers(){
        int a = 5;
        int b = 4;

        Calculator calculator = new Calculator();

        int val = calculator.multiply(a,b);

        assertEquals(20, val);
    }
}
