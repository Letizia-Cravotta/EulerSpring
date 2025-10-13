package com.Kohaku.EulerSpringNew;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class Euler0Test {

    @Autowired
    Euler0 euler0;

    @Test
    void solve() {
        assertEquals(35, euler0.solve(5));
        assertEquals(1, euler0.solve(2));
        assertEquals(10, euler0.solve(3));
        assertEquals(81550645333202000L, euler0.solve(788_000));
    }

    @Test
    void testIsSquareNumber() {
        assertTrue(euler0.isSquareNumber(4));
        assertTrue(euler0.isSquareNumber(9));
        assertFalse(euler0.isSquareNumber(5));
        assertFalse(euler0.isSquareNumber(-1));
    }

    @Test
    void testIsOdd() {
        assertTrue(euler0.isOdd(3L));
        assertFalse(euler0.isOdd(4L));

    }
}
