/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author X
 */
public class DivisionTest {
    @Test
    public void testDivisionCero() {

        Calculadora calc = new Calculadora();

        assertThrows(
                ArithmeticException.class,
                () -> {
                    calc.division(10, 0);
                }
        );
    }
    
    @Test
public void testDivisionNormal(){

    Calculadora calc = new Calculadora();

    assertEquals(5,calc.division(10,2));

}
}
