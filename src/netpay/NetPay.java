/*
 * Corbin Nash
 * NetPay.java
 * 
 */
package netpay;
import java.text.DecimalFormat;
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 10.99;
        double tax = 1.13;
        double bill = price*tax;
        DecimalFormat x = new DecimalFormat ("##.##");
        System.out.println("Restarant Bill");
        System.out.println("~~~~~~~~~~~~~");
        System.out.println("Price = " + price);
        System.out.println("Tax = " + tax);
        System.out.println("Total = " +x.format(bill));
        System.out.println("~~~~~~~~~~~~~");
    }
    
}
