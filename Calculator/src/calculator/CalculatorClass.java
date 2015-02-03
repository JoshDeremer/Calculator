/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;


/**
 *
 * @author Josh
 */

public class CalculatorClass implements CalculatorInterface {
    public CalculatorClass()
    {
        System.out.println("Initializing Calculator");
    }
    
    public int add(int a,int b)
    {
        return(a+b);
    }
    
    public int subt(int a,int b)
    {
        return(a-b);
    }
    
    public int mult(int a,int b)
    {
        return(a*b);
    }
    
    public int div(int a,int b)
    {
        return(a/b);
    }
}
