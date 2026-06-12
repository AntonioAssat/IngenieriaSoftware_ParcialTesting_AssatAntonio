/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Admin
 */
public class CalculadoraTest {
    
    private Calculadora calculadora;
    
        @BeforeAll
    static void beforeAll() {
        System.out.println("Bienvenido a las pruebas de la Calculadora");
    }

    @BeforeEach
    void beforeEach(TestInfo testInfo) {
        calculadora = new Calculadora();
        System.out.println("Ejecutando prueba: " + testInfo.getDisplayName());
    }

    @AfterEach
    void afterEach() {
        calculadora = null;
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("La operación ha finalizado");
    }
    
    
        @Test
    void testSumar() {
        double resultado = calculadora.suma(5.5, 2.5);
        assertEquals(8.0, resultado, 0.001);
    }

    @Test
    void testRestar() {
        double resultado = calculadora.resta(10.0, 4.0);
        assertEquals(6.0, resultado, 0.001);
    }

}
