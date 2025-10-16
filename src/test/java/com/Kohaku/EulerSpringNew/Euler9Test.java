package com.Kohaku.EulerSpringNew;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class Euler9Test {

    @Autowired
    Euler9 euler9;

    @Test
    void solve(){
        assertEquals(60, euler9.solve(12));
        assertEquals(-1, euler9.solve(13));
        assertEquals(31875000, euler9.solve(1000));

    }
    @Test
    void isPythagoreanTriplet(){
        assertTrue(euler9.isPythagoreanTriplet(3,4,5));
        assertFalse(euler9.isPythagoreanTriplet(3,4,6));
    }
}
