package mycode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sayhello.MyTest;

public class MyTestCase {

    @Test
    void calFactorial_01() {
        int actual = MyTest.calFactorial(0);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void calFactorial_02() {
        int actual = MyTest.calFactorial(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void calFactorial_03() {
        int actual = MyTest.calFactorial(3);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void calFactorial_04() {
        int actual = MyTest.calFactorial(4);
        int expected = 24;
        assertEquals(expected, actual);
    }

    @Test
    void calFactorial_05() {
        int actual = MyTest.calFactorial(5);
        int expected = 120;
        assertEquals(expected, actual);
    }
}