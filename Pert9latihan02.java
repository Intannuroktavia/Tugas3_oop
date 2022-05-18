package pert9latihan02;

/**
 *
 * @author INTAN NUR OKTAVIA 20103321
 */
public class Pert9latihan02 {
 
    public static void main(String[] args) {
        
        ConversiSuhu con = new ConversiSuhu();
        con.setC(25);
        System.out.println("Suhu Celsius Ke Fahrenheit   :"+con.Conversi("C-F"));
       
        con.setF(30);
        System.out.println("Suhu Fahrenheit Ke Celsius   :"+con.Conversi("F-C"));
        
        
    }
    
}