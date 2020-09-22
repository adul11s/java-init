import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Locale;


public class currency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indians = new Locale ("en","IN");
        NumberFormat nfUs = NumberFormat.getCurrencyInstance(Locale.US); 
        NumberFormat nfIn = NumberFormat.getCurrencyInstance(indians); 
        NumberFormat nfCh = NumberFormat.getCurrencyInstance(Locale.CHINA); 
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = nfUs.format(payment) ;
        String india = nfIn.format(payment);
        String china = nfCh.format(payment);
        String france = nfFrance.format(payment);  


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
