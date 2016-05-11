package rmicalculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author kelseyhyde
 */
public class Calc extends UnicastRemoteObject implements CalcInterface {
    
    public Calc()throws RemoteException{
    }
    
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
    
    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
    
    @Override
    public int multiply(int a, int b) throws RemoteException {
        return a * b;
    }
    
    @Override
    public int divide(int a, int b) throws RemoteException {
        return a / b;
    }
    
}