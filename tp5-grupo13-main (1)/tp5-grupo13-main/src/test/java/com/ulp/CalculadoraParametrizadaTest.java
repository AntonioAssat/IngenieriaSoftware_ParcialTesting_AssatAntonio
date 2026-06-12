package com.ulp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraParametrizadaTest {
    
    public CalculadoraParametrizadaTest() {}
    
    @ParameterizedTest
    @CsvSource({
        "8,7,15",
        "2,0,2",
        "10,-1,9"
    })
    void testSumaParams(double numeroA, double numeroB, double res){
        var calc = new Calculadora();
        assertEquals(res, calc.suma(numeroA, numeroB));
    }
    
    
}
