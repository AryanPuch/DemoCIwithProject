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
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }

    @Test
    public void testIsValidLengthGood() {
        System.out.println("isValidLengthGood");
        // Good test is with more than 8 characters of password
        String password = "mylongpasword";
        boolean expResult = true;
        assertEquals(expResult, PasswordValidator.isValidLength(password));
    }
    
}
