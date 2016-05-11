package rmicalculator;

import java.rmi.registry.Registry;
/**
 *
 * @author kelseyhyde
 */
public class CalcServer {
    public static void main(String[] args) {
        
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Hello", new Calc());
            System.out.println("Server is connected and ready for operation");
             
        }catch(Exception e){
            e.printStackTrace();
        }  
    }
}
