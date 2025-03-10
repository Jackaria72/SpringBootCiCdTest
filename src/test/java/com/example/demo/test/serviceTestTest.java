package com.example.demo.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class serviceTestTest {

    @Test
    void testGreet() {
        ServiceTest serviceTest = new ServiceTest();
        assertEquals("Hello", serviceTest.greet());
    }
}