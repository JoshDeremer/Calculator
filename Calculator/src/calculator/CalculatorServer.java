/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Josh
 */

public class CalculatorServer extends UnicastRemoteObject implements CalculatorInterface {
    public CalculatorServer() throws RemoteException
    {
        System.out.println("Initializing Server");
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
    
    public static void main(String args[])
    {
        try
        {
            CalculatorServer ms=new CalculatorServer();
            java.rmi.Naming.rebind("MathServ",ms);
            System.out.println("Server Ready");
        }
        catch(RemoteException RE)
        {
            System.out.println("Remote Server Error:"+ RE.getMessage());
            System.exit(0);
        }
        catch(MalformedURLException ME)
        {
            System.out.println("Invalid URL!!");
        }
    }
}
