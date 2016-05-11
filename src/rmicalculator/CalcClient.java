package rmicalculator;

import java.rmi.Naming;
/**
 * @author kelseyhyde
 */
public class CalcClient {
    public static void main(String[] args) {
        try{           
            CalcInterface hello = (CalcInterface)Naming.lookup("//localhost/Hello");
            System.out.println(hello.add(20, 4));
            System.out.println(hello.subtract(20, 4));
            System.out.println(hello.multiply(20, 4));
            System.out.println(hello.divide(20, 4));
            
        }catch(Exception e){
            e.printStackTrace();
        }
         
    }
}