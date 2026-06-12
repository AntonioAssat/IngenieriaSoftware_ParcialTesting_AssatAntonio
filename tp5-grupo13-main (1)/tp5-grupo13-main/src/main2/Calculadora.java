/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anitabonita
 */
public class Calculadora {
    public double suma(double a, double b){
        return a+b;
    }
    
    public double resta(double a, double b){
        return a-b;
    }
    
    public int multiplicacion(int a, int b){
        return a*b;
    }
    
    public int division(int a, int b){
        if(b==0){
            throw new ArithmeticException("intentó dividir por 0");
        }
        return a/b;
    }
}
