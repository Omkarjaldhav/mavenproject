package com.omkar_general_store;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testEggsCalculation() {
        double result = App.calculateTotal(1, 10);
        assertEquals(60, result);
    }

    @Test
    void testBiscuitCalculation() {
        double result = App.calculateTotal(2, 5);
        assertEquals(50, result);
    }

    @Test
    void testMoongDalCalculation() {
        double result = App.calculateTotal(3, 2);
        assertEquals(240, result);
    }

    @Test
    void testInvalidChoice() {
        double result = App.calculateTotal(10, 5);
        assertEquals(-1, result);
    }
}
