package com.juit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("BEFORE ALL -> ");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("BEFORE EACH -> ");
    }

    @AfterEach
    void afterEach(){
        System.out.println("AFTER EACH -> ");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AFTER ALL -> ");
    }

    @Test
    void test() {
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual, "method should add 2 numbers");
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw exception");
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "should return right circle area");
    }
}
