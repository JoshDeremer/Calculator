/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Josh
 * 
 * This is a basic interface for a calculator. It requires the four basic operations to 
 * be implemented by the classes that will extend this interface: addition, subtraction,
 * multiplication and division.
 * 
 * Created by JoshDeremer
 */

public interface CalculatorInterface {
    public int add(int a,int b) throws RemoteException;
    public int subt(int a,int b) throws RemoteException;
    public int mult(int a,int b) throws RemoteException;
    public int div(int a,int b) throws RemoteException;
}
