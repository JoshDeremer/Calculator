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

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface {
    public int add(int a,int b) throws RemoteException;
    public int subt(int a,int b) throws RemoteException;
    public int mult(int a,int b) throws RemoteException;
    public int div(int a,int b) throws RemoteException;
}
