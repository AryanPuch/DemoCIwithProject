/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aryan
 */
public class HelloTest {
    
    public HelloTest() {
    }
    
    @Test
    public void testSayHello() {
        Hello hello = new Hello();
        assertEquals("Hello World!!", hello.sayHello());
    }

    @Test
    public void testAddNumbers() {
        
    }
}
