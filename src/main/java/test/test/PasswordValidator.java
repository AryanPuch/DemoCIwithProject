/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test.test;

/**
 *
 * @author Aryan Puchimada
 */
public class PasswordValidator {
    // At least of length 8 characters
    public static boolean isValidLength(String password) {
        if(password.length() >= 8) {
            return true;
        }
        return false;
    }
}
