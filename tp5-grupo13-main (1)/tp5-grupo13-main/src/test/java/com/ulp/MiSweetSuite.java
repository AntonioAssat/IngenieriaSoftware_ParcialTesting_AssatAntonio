/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 *
 * @author esteb
 */

@Suite
@SelectClasses({
    CalculadoraTest.class,
    DivisionTest.class,
    CalculadoraParametrizadaTest.class
})    
public class MiSweetSuite {
    
}
